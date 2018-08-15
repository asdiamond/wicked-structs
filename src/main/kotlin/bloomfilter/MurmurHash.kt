package bloomfilter

import java.nio.ByteBuffer
import java.util.*

/**
 * A personal implementation of the MurmurHash hashing function in kotlin.
 * Taken liberally from MurmurHash2 by Austin Appleby(https://sites.google.com/site/murmurhash/)
 *
 * This uses the implementations size of int, in the jvm and on most machines this is 4, so
 * that is fine. We obviously cannot read values from any address without exploding, so in the
 * case there is an underflow we generate a quick random.
 *
 * There are some limitations inherited from Austin's original MurmurHash
 * * does not work incrementally
 * * does not produce same results on little-endian and big endian machines**
 *
 * **if youre deploying this to native.
 * @author Aleksandr Diamond
 *
 * @param length Length of output hashes, in 4 byte words. 10 by default
 * @param seed Seed of hash function. 0 by default.
 */
class MurmurHash(private val length: Int = 10, private val seed: Int = 0){
    //'m' and 'r' are mixing constants generated offline by austin.
    // not really magicaly, but they work well
    private val m = 0x5bd1e995
    private val r = 24


    /**
     * Uses toString operation of Any to hash the given key
     * using an adaptation of Murmur2
     * @param key Anything that can be converted to a string.
     */
    fun hash(key: Any): Int {
        var len = length

        //initialize hash to random value
        var h = seed xor len

        //using buffer to emulate C style pointer
        val data = ByteBuffer.wrap(key.toString().toByteArray())
        while(len >= 4){
            //reads first 4 bytes from buffer and converts them to int
            //obviously cant read any address without exploding, so if
            //there isnt enough room just return a random int and be done with it
            var k = if(data.remaining() < 4) Random().nextInt() else data.int

            k *= m
            k = k xor (k shr r)
            k *= m

            h *= m
            h = h xor k

            len -= 4
        }

        //handle last few bytes of input array
        when(len){
        //seriously? this is the correct way to do a switch?
            3 -> {
                h = h xor (data[2].toInt() shl 16)
                h = h xor (data[1].toInt() shl 8)
                h = h xor data[0].toInt()
            }
            2 -> {
                h = h xor (data[1].toInt() shl 8)
                h = h xor data[0].toInt()
            }
            1 -> {
                h = h xor data[0].toInt()
            }
        }
        h *= m

        //do a few final mixes to ensure last few bytes are up in there
        h = h xor (h shr 13)
        h *= m
        h = h xor (h shr 15)
        return h
    }
}

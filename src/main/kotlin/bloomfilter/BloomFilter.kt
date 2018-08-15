package bloomfilter

import java.util.*

/**
 * A Bloom filter is a space-efficient probabilistic data structure,
 * conceived by Burton Howard Bloom in 1970, that is used to test
 * whether an element is a member of a set. False positive matches are possible,
 * but false negatives are not – in other words, a query returns either "possibly in set"
 * or "definitely not in set". Elements can be added to the set, but not removed
 * (though this can be addressed with a "counting" filter);
 * the more elements that are added to the set, the larger the probability of false positives.
 */
class BloomFilter(private val size: Int, k: Int) {
    /*
      An empty Bloom filter is a bit array of m bits, all set to 0.
      There must also be k different hash functions defined,
      each of which maps or hashes some set element to one of the m array positions,
      generating a uniform random distribution.
      Typically, k is a constant, much smaller than m, which is proportional
      to the number of elements to be added;
      the precise choice of k and the constant of proportionality of m are
      determined by the intended false positive rate of the filter.
     */

    val internalFilter = BooleanArray(size)//all begin at false
    //random number generators as hashes, default constructor seeds with a random number
    val hashes = Array(k, {Random()})

    /**
     * To add an element, feed it to each of the k hash functions to get k array positions.
     * Set all bits (bools) at these positions to 1 (true)
     */
    fun add(candidate: Any){

    }

    /**
     * To query for an element feed it to each of the k hash functions to get k array positions.
     * If any of the bits at these positions is 0, the element is definetly not in the set.
     * Otherwise, if any bit is 1 (true), the element may be in the set.
     */
    fun contains(candidate: Any) : Boolean{
        return false
    }

    internal fun rand(from: Int, to: Int, random: Random) : Int {
        return random.nextInt(to - from) + from
    }

}
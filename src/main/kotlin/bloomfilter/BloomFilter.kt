package bloomfilter

/**
 * A Bloom filter is a space-efficient probabilistic data structure,
 * conceived by Burton Howard Bloom in 1970, that is used to test
 * whether an element is a member of a set. False positive matches are possible,
 * but false negatives are not – in other words, a query returns either "possibly in set"
 * or "definitely not in set". Elements can be added to the set, but not removed
 * (though this can be addressed with a "counting" filter);
 * the more elements that are added to the set, the larger the probability of false positives.
 */
class BloomFilter<E : Any?>(var m :Int) : Set<E> {
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
    val internalFilter = ArrayList<Boolean>(m)

    override val size: Int
        get() = TODO("not implemented") //To change initializer of created properties use File | Settings | File Templates.

    override fun contains(element: E): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun containsAll(elements: Collection<E>): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun isEmpty(): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun iterator(): Iterator<E> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}
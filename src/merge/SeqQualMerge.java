package merge;

import util.Read;

public class SeqQualMerge implements Merge{
    @Override
    public Read merge(Read a, Read b){
        if(a.getAvgQual() >= b.getAvgQual())
            return a;
        else
            return b;
    }
}

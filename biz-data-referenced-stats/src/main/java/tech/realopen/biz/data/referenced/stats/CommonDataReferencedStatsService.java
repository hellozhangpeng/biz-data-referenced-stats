package tech.realopen.biz.data.referenced.stats;

/**
 * @author ZhangPeng
 */
public class CommonDataReferencedStatsService implements  DataReferencedStatsService{
    @Override
    public int get(Object type, Object key) {
        return 0;
    }

    @Override
    public boolean isReferenced(Object type, Object key) {
        return false;
    }

    @Override
    public void add(Object type, Object key) {

    }

    @Override
    public void add(Object type, Object key, int value) {

    }
}

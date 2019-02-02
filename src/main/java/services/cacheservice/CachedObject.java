package services.cacheservice;

public class CachedObject implements Cacheable {

    private Object identifier;
    private Object cachedObject;

    public CachedObject(Object cachedObject, Object identifier){
        this.cachedObject = cachedObject;
        this.identifier = identifier;
    }

    @Override
    public Object getIdentifier() {
        return this.identifier;
    }

    @Override
    public Object getObject() {
        return this.cachedObject;
    }
}

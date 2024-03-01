package ma.zs.stocky.zynerator.security.common;

public interface SecurityParams {
    public static final String JWT_HEADER_NAME="Authorization";
    public static final String SECRET="19adc72c-2178-42ab-a04c-69a0790cb5ab";
    public static final long EXPIRATION=86400000;
    public static final String HEADER_PREFIX="Bearer ";
}

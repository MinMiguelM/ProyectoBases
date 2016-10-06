package entities;

import java.math.BigInteger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-10-05T22:18:33")
@StaticMetamodel(DbaUsers.class)
public class DbaUsers_ { 

    public static volatile SingularAttribute<DbaUsers, String> editionsEnabled;
    public static volatile SingularAttribute<DbaUsers, Date> created;
    public static volatile SingularAttribute<DbaUsers, String> profile;
    public static volatile SingularAttribute<DbaUsers, String> initialRsrcConsumerGroup;
    public static volatile SingularAttribute<DbaUsers, String> temporaryTablespace;
    public static volatile SingularAttribute<DbaUsers, BigInteger> userId;
    public static volatile SingularAttribute<DbaUsers, String> accountStatus;
    public static volatile SingularAttribute<DbaUsers, Date> expiryDate;
    public static volatile SingularAttribute<DbaUsers, String> passwordVersions;
    public static volatile SingularAttribute<DbaUsers, String> password;
    public static volatile SingularAttribute<DbaUsers, String> defaultTablespace;
    public static volatile SingularAttribute<DbaUsers, String> externalName;
    public static volatile SingularAttribute<DbaUsers, String> authenticationType;
    public static volatile SingularAttribute<DbaUsers, String> username;
    public static volatile SingularAttribute<DbaUsers, Date> lockDate;

}
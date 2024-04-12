package org.happy.homenetworkdisk.server.mapper;

import org.happy.homenetworkdisk.server.model.Propertie;

public interface PropertiesMapper {

    int insert(final Propertie p);

    int deleteByKey(final String propertieKey);

    Propertie selectByKey(final String propertieKey);

    int update(final Propertie p);

}

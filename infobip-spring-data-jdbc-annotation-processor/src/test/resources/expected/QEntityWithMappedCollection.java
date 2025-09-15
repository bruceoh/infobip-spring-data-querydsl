package com.infobip.spring.data.jdbc.annotation.processor;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.dsl.StringTemplate;

import com.querydsl.core.types.PathMetadata;
import com.querydsl.core.annotations.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QEntityWithMappedCollection is a Querydsl query type for EntityWithMappedCollection
 */
@SuppressWarnings("this-escape")
@Generated("com.infobip.spring.data.jdbc.annotation.processor.CustomMetaDataSerializer")
public class QEntityWithMappedCollection extends com.querydsl.sql.RelationalPathBase<EntityWithMappedCollection> {

    private static final long serialVersionUID = 94661349;

    public static final QEntityWithMappedCollection entityWithMappedCollection = new QEntityWithMappedCollection("EntityWithMappedCollection");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public QEntityWithMappedCollection(String variable) {
        super(EntityWithMappedCollection.class, forVariable(variable), "dbo", "EntityWithMappedCollection");
        addMetadata();
    }

    public QEntityWithMappedCollection(String variable, String schema, String table) {
        super(EntityWithMappedCollection.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QEntityWithMappedCollection(String variable, String schema) {
        super(EntityWithMappedCollection.class, forVariable(variable), schema, "EntityWithMappedCollection");
        addMetadata();
    }

    public QEntityWithMappedCollection(Path<? extends EntityWithMappedCollection> path) {
        super(path.getType(), path.getMetadata(), "dbo", "EntityWithMappedCollection");
        addMetadata();
    }

    public QEntityWithMappedCollection(PathMetadata metadata) {
        super(EntityWithMappedCollection.class, metadata, "dbo", "EntityWithMappedCollection");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(id, ColumnMetadata.named("Id").withIndex(0));
    }

}


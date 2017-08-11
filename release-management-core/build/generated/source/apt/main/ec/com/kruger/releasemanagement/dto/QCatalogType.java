package ec.com.kruger.releasemanagement.dto;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCatalogType is a Querydsl query type for CatalogType
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QCatalogType extends EntityPathBase<CatalogType> {

    private static final long serialVersionUID = 1689914549L;

    public static final QCatalogType catalogType = new QCatalogType("catalogType");

    public final ListPath<Catalog, QCatalog> catalogs = this.<Catalog, QCatalog>createList("catalogs", Catalog.class, QCatalog.class, PathInits.DIRECT2);

    public final ListPath<Catalog, QCatalog> catalogs1 = this.<Catalog, QCatalog>createList("catalogs1", Catalog.class, QCatalog.class, PathInits.DIRECT2);

    public final StringPath code = createString("code");

    public final StringPath description = createString("description");

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public QCatalogType(String variable) {
        super(CatalogType.class, forVariable(variable));
    }

    public QCatalogType(Path<? extends CatalogType> path) {
        super(path.getType(), path.getMetadata());
    }

    public QCatalogType(PathMetadata metadata) {
        super(CatalogType.class, metadata);
    }

}


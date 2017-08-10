package ec.com.kruger.releasemanagement.dto;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCatalog is a Querydsl query type for Catalog
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QCatalog extends EntityPathBase<Catalog> {

    private static final long serialVersionUID = 598404827L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCatalog catalog = new QCatalog("catalog");

    public final StringPath code = createString("code");

    public final StringPath description = createString("description");

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final QCatalogType type;

    public final NumberPath<Integer> typeId = createNumber("typeId", Integer.class);

    public QCatalog(String variable) {
        this(Catalog.class, forVariable(variable), INITS);
    }

    public QCatalog(Path<? extends Catalog> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCatalog(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCatalog(PathMetadata metadata, PathInits inits) {
        this(Catalog.class, metadata, inits);
    }

    public QCatalog(Class<? extends Catalog> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.type = inits.isInitialized("type") ? new QCatalogType(forProperty("type")) : null;
    }

}


CREATE TABLE cliente (
    cli_dui CHAR(9) NOT NULL,
    cli_nit CHAR(14) NOT NULL,
    cli_nombre VARCHAR(50) NOT NULL,
    cli_apellido VARCHAR(50) NOT NULL,
    cli_direccion VARCHAR(255) NOT NULL,
    cli_telefono CHAR(8) NOT NULL,
    cli_email VARCHAR(50),
    cli_juridica CHAR(1) DEFAULT '0',
    PRIMARY KEY(cli_dui),
    CONSTRAINT nit_cliente UNIQUE(cli_nit)
);

CREATE TABLE proveedor (
    prov_idProveedor INT NOT NULL,
    prov_nit CHAR(14),
    prov_dui CHAR(9),
    prov_nombre VARCHAR(50) NOT NULL,
    prov_apellido VARCHAR(50),
    prov_direccion VARCHAR(255),
    prov_telefono VARCHAR(8),
    prov_email VARCHAR(50),
    prov_juridica CHAR(1) DEFAULT '0',
    prov_frec_dias INT,
    PRIMARY KEY(prov_idProveedor),
    CONSTRAINT documentos_prov UNIQUE(prov_dui,prov_nit)
);

CREATE TABLE tipo_usuario (
    tusu_idTipoUsuario INT NOT NULL,
    tusu_tipo VARCHAR(20) NOT NULL,
    primary key(tusu_idTipoUsuario)
);

CREATE TABLE usuario (
    usu_dui CHAR(9) NOT NULL,
    usu_nit CHAR(14),
    usu_nombre VARCHAR(50) NOT NULL,
    usu_apellido VARCHAR(50) NOT NULL,
    usu_direccion VARCHAR(255) NOT NULL,
    usu_telefono VARCHAR(8),
    usu_email VARCHAR(50),
    usu_idTipoUsuario INT NOT NULL,
    usu_alias VARCHAR(20) NOT NULL,
    usu_contrasena VARCHAR(20) NOT NULL,
    PRIMARY KEY(usu_dui),
    CONSTRAINT nit_usuario UNIQUE(usu_nit),
    FOREIGN KEY(usu_idTipoUsuario) REFERENCES tipo_usuario(tusu_idTipoUsuario)
);

CREATE TABLE unidad_medida(
    unm_idUnidadMedida INT NOT NULL,
    unm_unidad VARCHAR(25) NOT NULL,
    PRIMARY KEY(unm_idUnidadMedida)
);

CREATE TABLE categoria (
    cat_idCategoria INT NOT NULL,
    cat_nombre VARCHAR(50) NOT NULL,
    PRIMARY KEY(cat_idCategoria)
);

CREATE TABLE producto (
    prod_codProducto INT NOT NULL,
    prod_nombre VARCHAR(100) NOT NULL,
    prod_descripcion VARCHAR(255),
	prod_idcategoria INT NOT NULL,
    prod_precio_unitario DECIMAL(9,2) NOT NULL,
    prod_precio_mayoreo DECIMAL(9,2) NOT NULL,
    prod_cant_min_mayoreo INT,
    prod_idUnidadMedida INT NOT NULL,
	prod_cantidad INT,
    prod_alerta_cantidad INT NOT NULL,
    PRIMARY KEY(prod_codProducto),
	FOREIGN KEY(prod_categoria) REFERENCES categoria(cat_idCategoria),
    FOREIGN KEY(prod_idUnidadMedida) REFERENCES unidad_medida(unm_idUnidadMedida)
);

CREATE TABLE lote (
    lot_idLote INT NOT NULL,
    lot_codProducto INT NOT NULL,
    lot_numero VARCHAR(50) NOT NULL,
    lot_fechaCaducidad DATE,
    PRIMARY KEY(lot_idLote),
    FOREIGN KEY(lot_codProducto) REFERENCES producto(prod_codProducto)
);

CREATE TABLE factura (
    fact_idFactura INT NOT NULL,
    fact_usuario_dui CHAR(9) NOT NULL,
    fact_cliente_dui CHAR(9),
    fact_fecha DATE NOT NULL,
    PRIMARY KEY(fact_idFactura),
    FOREIGN KEY(fact_usuario_dui) REFERENCES usuario(usu_dui),
    FOREIGN KEY(fact_cliente_dui) REFERENCES cliente(cli_dui)
);

CREATE TABLE detalle_factura (
    detf_idDetalleFactura INT NOT NULL,
    detf_codProducto INT NOT NULL,
    detf_idFactura INT NOT NULL,
    detf_cantidad INT NOT NULL,
    PRIMARY KEY(detf_idDetalleFactura),
    FOREIGN KEY(detf_codProducto) REFERENCES producto(prod_codProducto),
    FOREIGN KEY(detf_idFactura) REFERENCES factura(fact_idFactura)
);

CREATE TABLE compra (
    compra_idCompra INT NOT NULL,
    compra_usuario_dui CHAR(9) NOT NULL,
    compra_idProveedor INT NOT NULL,
    compra_fecha DATE NOT NULL,
    PRIMARY KEY(compra_idCompra),
    FOREIGN KEY(compra_usuario_dui) REFERENCES usuario(usu_dui),
    FOREIGN KEY(compra_idProveedor) REFERENCES proveedor(prov_idProveedor)
);

CREATE TABLE comprobante (
    comprob_idComprobante INT NOT NULL,
	comprob_idCompra INT NOT NULL,
    comprob_nombre VARCHAR(255) NOT NULL,
    PRIMARY KEY(comprob_idComprobante),
	FOREIGN KEY(comprob_idCompra) REFERENCES compra(compra_idCompra)
);

CREATE TABLE detalle_compra (
    dcomp_idDetalleCompra INT NOT NULL,
    dcomp_codProducto INT NOT NULL,
    dcomp_idCompra INT NOT NULL,
    dcomp_cantidad INT NOT NULL,
    dcomp_costo DECIMAL(9,2) NOT NULL,
    PRIMARY KEY(dcomp_idDetalleCompra),
    FOREIGN KEY(dcomp_codProducto) REFERENCES producto(prod_codProducto),
    FOREIGN KEY(dcomp_idCompra) REFERENCES compra(compra_idCompra)
);

--FIN--

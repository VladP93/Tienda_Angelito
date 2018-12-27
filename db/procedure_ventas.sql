CREATE OR REPLACE PROCEDURE ventas(cantidadProducto IN INTEGER, codigoProducto IN NUMBER) IS
    productoInventario INTEGER;
BEGIN
    productoInventario := 0;
    
    SELECT SUM(Producto.prod_cantidad) INTO productoInventario FROM producto where prod_codproducto = codigoProducto;

    --Verificar que la cantidad ingresada sea menos que las existencias    
    IF cantidadproducto > productoInventario THEN
        DBMS_OUTPUT.put_line('Cantidad insuficiente');
    ELSE
        DBMS_OUTPUT.put_line('Procesando venta');
        
        UPDATE producto SET prod_cantidad = (cantidadproducto - productoInventario) WHERE prod_codproducto = codigoProducto;
        
    END IF;
    
END;



--CREATE OR REPLACE PROCEDURE p (x OUT INTEGER, y OUT INTEGER) AS
--BEGIN
--  x := 17; y := 93;
--END;
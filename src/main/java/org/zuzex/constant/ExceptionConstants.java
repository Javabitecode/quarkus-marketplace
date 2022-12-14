package org.zuzex.constant;

import lombok.experimental.UtilityClass;

@UtilityClass
public class ExceptionConstants {
    public static final String SHOP_EXISTS = "Shop already exists. Change unique fields";
    public static final String SHOP_NOT_FOUND = "Shop not found";
    public static final String PRODUCT_DOES_NOT_ID = "Product does not have a productId";
    public static final String PRODUCT_NOT_FOUND = "Product not found";
    public static final String CATEGORY_NOT_FOUND = "Category not found";
    public static final String CATEGORY_IS_EXISTS = "Category is exists";
    public static final String PRODUCT_OUT_STOCK = "The product is out of stock";
}

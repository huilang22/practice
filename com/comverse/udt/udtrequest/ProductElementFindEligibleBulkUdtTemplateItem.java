/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductElementFindEligibleBulkUdtTemplateItem.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.math.BigInteger;

import com.csgsystems.api.bulk.*;
import com.csgsystems.udt.*;

import com.csgsystems.aruba.connection.BSDMSessionContext;
import com.csgsystems.bp.data.*;
import com.csgsystems.cf.data.*;

/**
 *
 * Class used to create a ProductElementFindEligibleBulkUdtTemplateItem Bulk Template
 *
 */

public class ProductElementFindEligibleBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected EntityObjectData[] __entity;
  protected ProductElementObjectFilter product_element;
  protected Integer address_id;
  protected Integer[] industry_type;
  protected Date __effective_date;
  protected Integer ___check_type;
/**
 *
 * Constructor to create a  ProductElementFindEligibleBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ProductElementFindEligibleBulkUdtTemplateItem(String id, BSDMSessionContext context, EntityObjectData[] __entityIn, ProductElementObjectFilter product_elementIn, Integer address_idIn, Integer[] industry_typeIn, Date __effective_dateIn, Integer ___check_typeIn) {
    super(id, context, "ProductElementFindEligible");
    __entity = __entityIn;
    product_element = product_elementIn;
    address_id = address_idIn;
    industry_type = industry_typeIn;
    __effective_date = __effective_dateIn;
    ___check_type = ___check_typeIn;
  }

  public void translateToMap() {
    if (__entity != null) {
      if (__entity != null) {
        Object[] list = new Object[__entity.length];
        for (int i = 0; i < __entity.length; i++) {
          list[i] = EntityObjectHelper.getMap(__entity[i], (Map) list[i]);
          if (list[i] != null) ((Map) list[i]).put ("#NAME", "ProductElement");
        }
        addInput("EntityList", list);
      }
    }
    if (product_element != null) {
      Integer index =  product_element.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ProductElement", ProductElementObjectHelper.toMap(product_element, new HashMap(), "ProductElement").get("ProductElement"));
    }
    if (address_id != null) {
      addInput("AddressId", address_id);
    }
    if (industry_type != null) {
      addInput("IndustryTypeList", industry_type);
    }
    if (__effective_date != null) {
      addInput("EffectiveDate", __effective_date);
    }
    if (___check_type != null) {
      addInput("CheckType", ___check_type);
    }
  }


/**
 *
 * Sets the Entity
 * @param __entityIn Value of the __entity
 *
 */

  public void setEntity(EntityObjectData[] __entityIn) {
    __entity = __entityIn;
  }

/**
 *
 * Sets the ProductElement
 * @param product_elementIn Value of the product_element
 *
 */

  public void setProductElement(ProductElementObjectFilter product_elementIn) {
    product_element = product_elementIn;
  }

/**
 *
 * Sets the AddressId
 * @param address_idIn Value of the address_id
 *
 */

  public void setAddressId(Integer address_idIn) {
    address_id = address_idIn;
  }

/**
 *
 * Sets the IndustryType
 * @param industry_typeIn Value of the industry_type
 *
 */

  public void setIndustryType(Integer[] industry_typeIn) {
    industry_type = industry_typeIn;
  }

/**
 *
 * Sets the EffectiveDate
 * @param __effective_dateIn Value of the __effective_date
 *
 */

  public void setEffectiveDate(Date __effective_dateIn) {
    __effective_date = __effective_dateIn;
  }

/**
 *
 * Sets the CheckType
 * @param ___check_typeIn Value of the ___check_type
 *
 */

  public void setCheckType(Integer ___check_typeIn) {
    ___check_type = ___check_typeIn;
  }

  public void translateFromMap() {
    Object[] list = (Object[]) inputMap.get("EntityList");
    if (list != null) {
      __entity = new EntityObjectData[list.length];
      for (int i = 0; i < list.length; i++) {
        __entity[i] = EntityObjectHelper.getObj((Map) list[i]);
        __entity[i].resetFlags(true, true);
      }
    }
    product_element = ProductElementObjectHelper.fromMapFilter(inputMap, "ProductElement");
    address_id = (Integer)inputMap.get("AddressId");
    industry_type = (Integer[])inputMap.get("IndustryType");
    __effective_date = (Date)inputMap.get("EffectiveDate");
    ___check_type = (Integer)inputMap.get("CheckType");
  }

/**
 *
 * Gets the Entity
 * @return Value of the Entity
 *
 */

  public EntityObjectData[] getEntity( ) {
    return __entity;
  }

/**
 *
 * Gets the ProductElement
 * @return Value of the ProductElement
 *
 */

  public ProductElementObjectFilter getProductElement( ) {
    return product_element;
  }

/**
 *
 * Gets the AddressId
 * @return Value of the AddressId
 *
 */

  public Integer getAddressId( ) {
    return address_id;
  }

/**
 *
 * Gets the IndustryType
 * @return Value of the IndustryType
 *
 */

  public Integer[] getIndustryType( ) {
    return industry_type;
  }

/**
 *
 * Gets the EffectiveDate
 * @return Value of the EffectiveDate
 *
 */

  public Date getEffectiveDate( ) {
    return __effective_date;
  }

/**
 *
 * Gets the CheckType
 * @return Value of the CheckType
 *
 */

  public Integer getCheckType( ) {
    return ___check_type;
  }

}

/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProductPackageActiveComponentCountBulkUdtTemplateItem.java
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
import com.csgsystems.om.data.*;

/**
 *
 * Class used to create a ProductPackageActiveComponentCountBulkUdtTemplateItem Bulk Template
 *
 */

public class ProductPackageActiveComponentCountBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected ProductPackageObjectKeyData activeCountIn;
  protected Date effective_date;
  protected Integer component_id;
/**
 *
 * Constructor to create a  ProductPackageActiveComponentCountBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public ProductPackageActiveComponentCountBulkUdtTemplateItem(String id, BSDMSessionContext context, ProductPackageObjectKeyData activeCountInIn, Date effective_dateIn, Integer component_idIn) {
    super(id, context, "ProductPackageActiveComponentCount");
    activeCountIn = activeCountInIn;
    effective_date = effective_dateIn;
    component_id = component_idIn;
  }

  public void translateToMap() {
    if (activeCountIn != null) {
      activeCountIn.resetFlags(true, true);
      addInput("ProductPackage", ProductPackageObjectKeyHelper.toMap(activeCountIn, new HashMap(), "ProductPackageObjectKeyData").get("ProductPackageObjectKeyData"));
    }
    if (effective_date != null) {
      addInput("EffectiveDate", effective_date);
    }
    if (component_id != null) {
      addInput("ComponentId", component_id);
    }
  }


/**
 *
 * Sets the ProductPackage
 * @param activeCountInIn Value of the activeCountIn
 *
 */

  public void setProductPackage(ProductPackageObjectKeyData activeCountInIn) {
    activeCountIn = activeCountInIn;
  }

/**
 *
 * Sets the EffectiveDate
 * @param effective_dateIn Value of the effective_date
 *
 */

  public void setEffectiveDate(Date effective_dateIn) {
    effective_date = effective_dateIn;
  }

/**
 *
 * Sets the ComponentId
 * @param component_idIn Value of the component_id
 *
 */

  public void setComponentId(Integer component_idIn) {
    component_id = component_idIn;
  }

  public void translateFromMap() {
    activeCountIn = ProductPackageObjectKeyHelper.fromMap(inputMap, "ProductPackage");
    effective_date = (Date)inputMap.get("EffectiveDate");
    component_id = (Integer)inputMap.get("ComponentId");
  }

/**
 *
 * Gets the ProductPackage
 * @return Value of the ProductPackage
 *
 */

  public ProductPackageObjectKeyData getProductPackage( ) {
    return activeCountIn;
  }

/**
 *
 * Gets the EffectiveDate
 * @return Value of the EffectiveDate
 *
 */

  public Date getEffectiveDate( ) {
    return effective_date;
  }

/**
 *
 * Gets the ComponentId
 * @return Value of the ComponentId
 *
 */

  public Integer getComponentId( ) {
    return component_id;
  }

}

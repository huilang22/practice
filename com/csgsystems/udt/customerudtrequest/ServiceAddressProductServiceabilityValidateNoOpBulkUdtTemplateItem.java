/*
 * Generated code DO NOT EDIT
 * Generated file: ServiceAddressProductServiceabilityValidateNoOpBulkUdtTemplateItem.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

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
 * NoOp class used to simulate a ServiceAddressProductServiceabilityValidateNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ServiceAddressProductServiceabilityValidateNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ProductObjectDataList noOpIn;

/**
 *
 * Constructor to create a   ServiceAddressProductServiceabilityValidateNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ServiceAddressProductServiceabilityValidateNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ProductObjectDataList noOpInIn) {
    super(id, context, "ServiceAddressProductServiceabilityValidate");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      Map mapList = new HashMap();
      Map[] mapArray = null;
      mapList.put("Count", noOpIn.getLength());
      mapList.put("TotalCount", noOpIn.getTotalCount());
      mapList.put("Index", noOpIn.getIndex());
      mapArray = new HashMap[noOpIn.getLength()];
      for (int i = 0; i < noOpIn.getLength(); i++) {
          noOpIn.getArray()[i].resetFlags(true, true);
        mapArray[i] = ProductObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("Product", noOpIn);
      }
      addInput("Product", mapList);
    }
  }
/**
 *
 * Sets the  Product
 * @param noOpInIn ProductObjectDataList to set
 *
 */
  public void setProduct(ProductObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the Product passed into the constructor
 * @return Simulated response
 *
 */
  public ProductObjectDataList getProduct() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ProductObjectHelper.fromMapList(inputMap, "ProductList");
  }
}

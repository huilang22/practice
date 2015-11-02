/*
 * Generated code DO NOT EDIT
 * Generated file: ServiceableProductTypeFindNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;
import com.csgsystems.om.data.*;

/**
 *
 * NoOp class used to simulate a ServiceableProductTypeFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ServiceableProductTypeFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ProductElementObjectDataList noOpIn;

/**
 *
 * Constructor to create a   ServiceableProductTypeFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ServiceableProductTypeFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ProductElementObjectDataList noOpInIn) {
    super(id, context, "ServiceableProductTypeFind");
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
        mapArray[i] = ProductElementObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("ProductElement", noOpIn);
      }
      addInput("ProductElement", mapList);
    }
  }
/**
 *
 * Sets the  ProductElement
 * @param noOpInIn ProductElementObjectDataList to set
 *
 */
  public void setProductElement(ProductElementObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ProductElement passed into the constructor
 * @return Simulated response
 *
 */
  public ProductElementObjectDataList getProductElement() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ProductElementObjectHelper.fromMapList(inputMap, "ProductElementList");
  }
}

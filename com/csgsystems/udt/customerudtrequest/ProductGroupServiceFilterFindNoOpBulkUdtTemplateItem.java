/*
 * Generated code DO NOT EDIT
 * Generated file: ProductGroupServiceFilterFindNoOpBulkUdtTemplateItem.java
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

/**
 *
 * NoOp class used to simulate a ProductGroupServiceFilterFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ProductGroupServiceFilterFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected PGSFObjectDataList noOpIn;

/**
 *
 * Constructor to create a   ProductGroupServiceFilterFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ProductGroupServiceFilterFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, PGSFObjectDataList noOpInIn) {
    super(id, context, "ProductGroupServiceFilterFind");
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
        mapArray[i] = PGSFObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("ProductGroupServiceFilter", noOpIn);
      }
      addInput("ProductGroupServiceFilter", mapList);
    }
  }
/**
 *
 * Sets the  ProductGroupServiceFilter
 * @param noOpInIn PGSFObjectDataList to set
 *
 */
  public void setProductGroupServiceFilter(PGSFObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ProductGroupServiceFilter passed into the constructor
 * @return Simulated response
 *
 */
  public PGSFObjectDataList getProductGroupServiceFilter() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = PGSFObjectHelper.fromMapList(inputMap, "ProductGroupServiceFilterList");
  }
}

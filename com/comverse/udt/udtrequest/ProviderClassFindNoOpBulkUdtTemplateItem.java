/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProviderClassFindNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;

/**
 *
 * NoOp class used to simulate a ProviderClassFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ProviderClassFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ProvClsObjectDataList noOpIn;

/**
 *
 * Constructor to create a   ProviderClassFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ProviderClassFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ProvClsObjectDataList noOpInIn) {
    super(id, context, "ProviderClassFind");
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
        mapArray[i] = ProvClsObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("ProviderClass", noOpIn);
      }
      addInput("ProviderClass", mapList);
    }
  }
/**
 *
 * Sets the  ProviderClass
 * @param noOpInIn ProvClsObjectDataList to set
 *
 */
  public void setProviderClass(ProvClsObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ProviderClass passed into the constructor
 * @return Simulated response
 *
 */
  public ProvClsObjectDataList getProviderClass() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ProvClsObjectHelper.fromMapList(inputMap, "ProviderClassList");
  }
}

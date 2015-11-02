/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdApplicationDefaultFindNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.utl.data.*;

/**
 *
 * NoOp class used to simulate a BsdApplicationDefaultFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BsdApplicationDefaultFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BsdApplicationDefaultObjectDataList noOpIn;

/**
 *
 * Constructor to create a   BsdApplicationDefaultFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BsdApplicationDefaultFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdApplicationDefaultObjectDataList noOpInIn) {
    super(id, context, "BsdApplicationDefaultFind");
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
        mapArray[i] = BsdApplicationDefaultObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("BsdApplicationDefault", noOpIn);
      }
      addInput("BsdApplicationDefault", mapList);
    }
  }
/**
 *
 * Sets the  BsdApplicationDefault
 * @param noOpInIn BsdApplicationDefaultObjectDataList to set
 *
 */
  public void setBsdApplicationDefault(BsdApplicationDefaultObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BsdApplicationDefault passed into the constructor
 * @return Simulated response
 *
 */
  public BsdApplicationDefaultObjectDataList getBsdApplicationDefault() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BsdApplicationDefaultObjectHelper.fromMapList(inputMap, "BsdApplicationDefaultList");
  }
}

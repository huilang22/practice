/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdApplicationFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BsdApplicationFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BsdApplicationFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BsdApplicationObjectDataList noOpIn;

/**
 *
 * Constructor to create a   BsdApplicationFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BsdApplicationFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdApplicationObjectDataList noOpInIn) {
    super(id, context, "BsdApplicationFind");
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
        mapArray[i] = BsdApplicationObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("BsdApplication", noOpIn);
      }
      addInput("BsdApplication", mapList);
    }
  }
/**
 *
 * Sets the  BsdApplication
 * @param noOpInIn BsdApplicationObjectDataList to set
 *
 */
  public void setBsdApplication(BsdApplicationObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BsdApplication passed into the constructor
 * @return Simulated response
 *
 */
  public BsdApplicationObjectDataList getBsdApplication() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BsdApplicationObjectHelper.fromMapList(inputMap, "BsdApplicationList");
  }
}

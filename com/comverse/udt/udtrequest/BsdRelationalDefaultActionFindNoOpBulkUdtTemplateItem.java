/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdRelationalDefaultActionFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BsdRelationalDefaultActionFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BsdRelationalDefaultActionFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BsdRelationalDefaultObjectDataList noOpIn;

/**
 *
 * Constructor to create a   BsdRelationalDefaultActionFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BsdRelationalDefaultActionFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BsdRelationalDefaultObjectDataList noOpInIn) {
    super(id, context, "BsdRelationalDefaultActionFind");
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
        mapArray[i] = BsdRelationalDefaultObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("BsdRelationalDefault", noOpIn);
      }
      addInput("BsdRelationalDefault", mapList);
    }
  }
/**
 *
 * Sets the  BsdRelationalDefault
 * @param noOpInIn BsdRelationalDefaultObjectDataList to set
 *
 */
  public void setBsdRelationalDefault(BsdRelationalDefaultObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BsdRelationalDefault passed into the constructor
 * @return Simulated response
 *
 */
  public BsdRelationalDefaultObjectDataList getBsdRelationalDefault() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BsdRelationalDefaultObjectHelper.fromMapList(inputMap, "BsdRelationalDefaultList");
  }
}

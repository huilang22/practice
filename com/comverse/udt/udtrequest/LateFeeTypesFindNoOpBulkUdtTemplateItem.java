/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * LateFeeTypesFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a LateFeeTypesFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class LateFeeTypesFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected LFTObjectDataList noOpIn;

/**
 *
 * Constructor to create a   LateFeeTypesFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public LateFeeTypesFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, LFTObjectDataList noOpInIn) {
    super(id, context, "LateFeeTypesFind");
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
        mapArray[i] = LFTObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("LateFeeTypes", noOpIn);
      }
      addInput("LateFeeTypes", mapList);
    }
  }
/**
 *
 * Sets the  LateFeeTypes
 * @param noOpInIn LFTObjectDataList to set
 *
 */
  public void setLateFeeTypes(LFTObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the LateFeeTypes passed into the constructor
 * @return Simulated response
 *
 */
  public LFTObjectDataList getLateFeeTypes() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = LFTObjectHelper.fromMapList(inputMap, "LateFeeTypesList");
  }
}

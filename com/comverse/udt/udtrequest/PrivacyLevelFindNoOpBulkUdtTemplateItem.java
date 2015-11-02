/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PrivacyLevelFindNoOpBulkUdtTemplateItem.java
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

/**
 *
 * NoOp class used to simulate a PrivacyLevelFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class PrivacyLevelFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected PrivacyLevelObjectDataList noOpIn;

/**
 *
 * Constructor to create a   PrivacyLevelFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public PrivacyLevelFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, PrivacyLevelObjectDataList noOpInIn) {
    super(id, context, "PrivacyLevelFind");
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
        mapArray[i] = PrivacyLevelObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("PrivacyLevel", noOpIn);
      }
      addInput("PrivacyLevel", mapList);
    }
  }
/**
 *
 * Sets the  PrivacyLevel
 * @param noOpInIn PrivacyLevelObjectDataList to set
 *
 */
  public void setPrivacyLevel(PrivacyLevelObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the PrivacyLevel passed into the constructor
 * @return Simulated response
 *
 */
  public PrivacyLevelObjectDataList getPrivacyLevel() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = PrivacyLevelObjectHelper.fromMapList(inputMap, "PrivacyLevelList");
  }
}

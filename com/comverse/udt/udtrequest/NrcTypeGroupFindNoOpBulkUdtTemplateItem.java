/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NrcTypeGroupFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a NrcTypeGroupFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class NrcTypeGroupFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected NrcTypeGroupObjectDataList noOpIn;

/**
 *
 * Constructor to create a   NrcTypeGroupFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public NrcTypeGroupFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, NrcTypeGroupObjectDataList noOpInIn) {
    super(id, context, "NrcTypeGroupFind");
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
        mapArray[i] = NrcTypeGroupObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("NrcTypeGroup", noOpIn);
      }
      addInput("NrcTypeGroup", mapList);
    }
  }
/**
 *
 * Sets the  NrcTypeGroup
 * @param noOpInIn NrcTypeGroupObjectDataList to set
 *
 */
  public void setNrcTypeGroup(NrcTypeGroupObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the NrcTypeGroup passed into the constructor
 * @return Simulated response
 *
 */
  public NrcTypeGroupObjectDataList getNrcTypeGroup() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = NrcTypeGroupObjectHelper.fromMapList(inputMap, "NrcTypeGroupList");
  }
}

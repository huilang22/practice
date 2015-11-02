/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NrcGroupFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a NrcGroupFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class NrcGroupFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected NrcGroupObjectDataList noOpIn;

/**
 *
 * Constructor to create a   NrcGroupFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public NrcGroupFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, NrcGroupObjectDataList noOpInIn) {
    super(id, context, "NrcGroupFind");
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
        mapArray[i] = NrcGroupObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("NrcGroup", noOpIn);
      }
      addInput("NrcGroup", mapList);
    }
  }
/**
 *
 * Sets the  NrcGroup
 * @param noOpInIn NrcGroupObjectDataList to set
 *
 */
  public void setNrcGroup(NrcGroupObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the NrcGroup passed into the constructor
 * @return Simulated response
 *
 */
  public NrcGroupObjectDataList getNrcGroup() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = NrcGroupObjectHelper.fromMapList(inputMap, "NrcGroupList");
  }
}

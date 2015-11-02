/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * NrcNoBackoutFindNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.om.data.*;

/**
 *
 * NoOp class used to simulate a NrcNoBackoutFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class NrcNoBackoutFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected NrcInvObjectDataList noOpIn;

/**
 *
 * Constructor to create a   NrcNoBackoutFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public NrcNoBackoutFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, NrcInvObjectDataList noOpInIn) {
    super(id, context, "NrcNoBackoutFind");
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
        mapArray[i] = NrcInvObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("Nrc", noOpIn);
      }
      addInput("Nrc", mapList);
    }
  }
/**
 *
 * Sets the  Nrc
 * @param noOpInIn NrcInvObjectDataList to set
 *
 */
  public void setNrc(NrcInvObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the Nrc passed into the constructor
 * @return Simulated response
 *
 */
  public NrcInvObjectDataList getNrc() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = NrcInvObjectHelper.fromMapList(inputMap, "NrcList");
  }
}

/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * MktCodeFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a MktCodeFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class MktCodeFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected MCObjectDataList noOpIn;

/**
 *
 * Constructor to create a   MktCodeFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public MktCodeFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, MCObjectDataList noOpInIn) {
    super(id, context, "MktCodeFind");
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
        mapArray[i] = MCObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("MktCode", noOpIn);
      }
      addInput("MktCode", mapList);
    }
  }
/**
 *
 * Sets the  MktCode
 * @param noOpInIn MCObjectDataList to set
 *
 */
  public void setMktCode(MCObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the MktCode passed into the constructor
 * @return Simulated response
 *
 */
  public MCObjectDataList getMktCode() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = MCObjectHelper.fromMapList(inputMap, "MktCodeList");
  }
}

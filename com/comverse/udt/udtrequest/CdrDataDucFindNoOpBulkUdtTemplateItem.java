/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CdrDataDucFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a CdrDataDucFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CdrDataDucFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CdrDataDucObjectDataList noOpIn;

/**
 *
 * Constructor to create a   CdrDataDucFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CdrDataDucFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CdrDataDucObjectDataList noOpInIn) {
    super(id, context, "CdrDataDucFind");
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
        mapArray[i] = CdrDataDucObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("CdrDataDuc", noOpIn);
      }
      addInput("CdrDataDuc", mapList);
    }
  }
/**
 *
 * Sets the  CdrDataDuc
 * @param noOpInIn CdrDataDucObjectDataList to set
 *
 */
  public void setCdrDataDuc(CdrDataDucObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CdrDataDuc passed into the constructor
 * @return Simulated response
 *
 */
  public CdrDataDucObjectDataList getCdrDataDuc() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CdrDataDucObjectHelper.fromMapList(inputMap, "CdrDataDucList");
  }
}

/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CcViewDefFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a CcViewDefFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class CcViewDefFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected CcViewDefObjectDataList noOpIn;

/**
 *
 * Constructor to create a   CcViewDefFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public CcViewDefFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, CcViewDefObjectDataList noOpInIn) {
    super(id, context, "CcViewDefFind");
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
        mapArray[i] = CcViewDefObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("CcViewDef", noOpIn);
      }
      addInput("CcViewDef", mapList);
    }
  }
/**
 *
 * Sets the  CcViewDef
 * @param noOpInIn CcViewDefObjectDataList to set
 *
 */
  public void setCcViewDef(CcViewDefObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the CcViewDef passed into the constructor
 * @return Simulated response
 *
 */
  public CcViewDefObjectDataList getCcViewDef() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = CcViewDefObjectHelper.fromMapList(inputMap, "CcViewDefList");
  }
}

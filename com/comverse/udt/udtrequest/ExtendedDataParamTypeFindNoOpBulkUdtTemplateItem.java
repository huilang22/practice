/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ExtendedDataParamTypeFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a ExtendedDataParamTypeFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ExtendedDataParamTypeFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected XPTObjectDataList noOpIn;

/**
 *
 * Constructor to create a   ExtendedDataParamTypeFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ExtendedDataParamTypeFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, XPTObjectDataList noOpInIn) {
    super(id, context, "ExtendedDataParamTypeFind");
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
        mapArray[i] = XPTObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("ExtendedDataParamType", noOpIn);
      }
      addInput("ExtendedDataParamType", mapList);
    }
  }
/**
 *
 * Sets the  ExtendedDataParamType
 * @param noOpInIn XPTObjectDataList to set
 *
 */
  public void setExtendedDataParamType(XPTObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ExtendedDataParamType passed into the constructor
 * @return Simulated response
 *
 */
  public XPTObjectDataList getExtendedDataParamType() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = XPTObjectHelper.fromMapList(inputMap, "ExtendedDataParamTypeList");
  }
}

/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsContainerTypeFindNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.iv.data.*;

/**
 *
 * NoOp class used to simulate a InvsContainerTypeFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvsContainerTypeFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvsContainerTypeObjectDataList noOpIn;

/**
 *
 * Constructor to create a   InvsContainerTypeFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvsContainerTypeFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsContainerTypeObjectDataList noOpInIn) {
    super(id, context, "InvsContainerTypeFind");
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
        mapArray[i] = InvsContainerTypeObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvsContainerType", noOpIn);
      }
      addInput("InvsContainerType", mapList);
    }
  }
/**
 *
 * Sets the  InvsContainerType
 * @param noOpInIn InvsContainerTypeObjectDataList to set
 *
 */
  public void setInvsContainerType(InvsContainerTypeObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvsContainerType passed into the constructor
 * @return Simulated response
 *
 */
  public InvsContainerTypeObjectDataList getInvsContainerType() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvsContainerTypeObjectHelper.fromMapList(inputMap, "InvsContainerTypeList");
  }
}

/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DescriptionFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a DescriptionFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class DescriptionFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected DescriptionObjectDataList noOpIn;

/**
 *
 * Constructor to create a   DescriptionFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public DescriptionFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, DescriptionObjectDataList noOpInIn) {
    super(id, context, "DescriptionFind");
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
        mapArray[i] = DescriptionObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("Description", noOpIn);
      }
      addInput("Description", mapList);
    }
  }
/**
 *
 * Sets the  Description
 * @param noOpInIn DescriptionObjectDataList to set
 *
 */
  public void setDescription(DescriptionObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the Description passed into the constructor
 * @return Simulated response
 *
 */
  public DescriptionObjectDataList getDescription() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = DescriptionObjectHelper.fromMapList(inputMap, "DescriptionList");
  }
}

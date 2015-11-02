/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ExclusionRetrieveNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a ExclusionRetrieveNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ExclusionRetrieveNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ExclusionObjectDataList noOpIn;

/**
 *
 * Constructor to create a   ExclusionRetrieveNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ExclusionRetrieveNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ExclusionObjectDataList noOpInIn) {
    super(id, context, "ExclusionRetrieve");
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
        mapArray[i] = ExclusionObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("Exclusion", noOpIn);
      }
      addInput("Exclusion", mapList);
    }
  }
/**
 *
 * Sets the  Exclusion
 * @param noOpInIn ExclusionObjectDataList to set
 *
 */
  public void setExclusion(ExclusionObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the Exclusion passed into the constructor
 * @return Simulated response
 *
 */
  public ExclusionObjectDataList getExclusion() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ExclusionObjectHelper.fromMapList(inputMap, "ExclusionList");
  }
}

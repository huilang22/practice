/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsTypeFindEligibleNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.cf.data.*;

/**
 *
 * NoOp class used to simulate a InvsTypeFindEligibleNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class InvsTypeFindEligibleNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected InvsTypeObjectDataList noOpIn;

/**
 *
 * Constructor to create a   InvsTypeFindEligibleNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public InvsTypeFindEligibleNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, InvsTypeObjectDataList noOpInIn) {
    super(id, context, "InvsTypeFindEligible");
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
        mapArray[i] = InvsTypeObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("InvsType", noOpIn);
      }
      addInput("InvsType", mapList);
    }
  }
/**
 *
 * Sets the  InvsType
 * @param noOpInIn InvsTypeObjectDataList to set
 *
 */
  public void setInvsType(InvsTypeObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the InvsType passed into the constructor
 * @return Simulated response
 *
 */
  public InvsTypeObjectDataList getInvsType() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = InvsTypeObjectHelper.fromMapList(inputMap, "InvsTypeList");
  }
}

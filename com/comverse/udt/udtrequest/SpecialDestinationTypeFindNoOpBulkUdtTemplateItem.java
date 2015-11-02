/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * SpecialDestinationTypeFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a SpecialDestinationTypeFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class SpecialDestinationTypeFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected SpecialDestinationTypeObjectDataList noOpIn;

/**
 *
 * Constructor to create a   SpecialDestinationTypeFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public SpecialDestinationTypeFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, SpecialDestinationTypeObjectDataList noOpInIn) {
    super(id, context, "SpecialDestinationTypeFind");
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
        mapArray[i] = SpecialDestinationTypeObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("SpecialDestinationType", noOpIn);
      }
      addInput("SpecialDestinationType", mapList);
    }
  }
/**
 *
 * Sets the  SpecialDestinationType
 * @param noOpInIn SpecialDestinationTypeObjectDataList to set
 *
 */
  public void setSpecialDestinationType(SpecialDestinationTypeObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the SpecialDestinationType passed into the constructor
 * @return Simulated response
 *
 */
  public SpecialDestinationTypeObjectDataList getSpecialDestinationType() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = SpecialDestinationTypeObjectHelper.fromMapList(inputMap, "SpecialDestinationTypeList");
  }
}

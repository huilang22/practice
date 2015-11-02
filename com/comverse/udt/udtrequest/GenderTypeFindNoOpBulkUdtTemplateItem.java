/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GenderTypeFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a GenderTypeFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class GenderTypeFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected GenderTypeObjectDataList noOpIn;

/**
 *
 * Constructor to create a   GenderTypeFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public GenderTypeFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, GenderTypeObjectDataList noOpInIn) {
    super(id, context, "GenderTypeFind");
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
        mapArray[i] = GenderTypeObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("GenderType", noOpIn);
      }
      addInput("GenderType", mapList);
    }
  }
/**
 *
 * Sets the  GenderType
 * @param noOpInIn GenderTypeObjectDataList to set
 *
 */
  public void setGenderType(GenderTypeObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the GenderType passed into the constructor
 * @return Simulated response
 *
 */
  public GenderTypeObjectDataList getGenderType() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = GenderTypeObjectHelper.fromMapList(inputMap, "GenderTypeList");
  }
}

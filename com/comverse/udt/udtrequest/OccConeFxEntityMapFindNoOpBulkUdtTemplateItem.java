/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OccConeFxEntityMapFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a OccConeFxEntityMapFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class OccConeFxEntityMapFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected OCFEMObjectDataList noOpIn;

/**
 *
 * Constructor to create a   OccConeFxEntityMapFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public OccConeFxEntityMapFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, OCFEMObjectDataList noOpInIn) {
    super(id, context, "OccConeFxEntityMapFind");
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
        mapArray[i] = OCFEMObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("OccConeFxEntityMap", noOpIn);
      }
      addInput("OccConeFxEntityMap", mapList);
    }
  }
/**
 *
 * Sets the  OccConeFxEntityMap
 * @param noOpInIn OCFEMObjectDataList to set
 *
 */
  public void setOccConeFxEntityMap(OCFEMObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the OccConeFxEntityMap passed into the constructor
 * @return Simulated response
 *
 */
  public OCFEMObjectDataList getOccConeFxEntityMap() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = OCFEMObjectHelper.fromMapList(inputMap, "OccConeFxEntityMapList");
  }
}

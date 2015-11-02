/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ExternalIdTypeFindNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a ExternalIdTypeFindNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class ExternalIdTypeFindNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected ExternalIdTypeObjectDataList noOpIn;

/**
 *
 * Constructor to create a   ExternalIdTypeFindNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public ExternalIdTypeFindNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, ExternalIdTypeObjectDataList noOpInIn) {
    super(id, context, "ExternalIdTypeFind");
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
        mapArray[i] = ExternalIdTypeObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("ExternalIdType", noOpIn);
      }
      addInput("ExternalIdType", mapList);
    }
  }
/**
 *
 * Sets the  ExternalIdType
 * @param noOpInIn ExternalIdTypeObjectDataList to set
 *
 */
  public void setExternalIdType(ExternalIdTypeObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the ExternalIdType passed into the constructor
 * @return Simulated response
 *
 */
  public ExternalIdTypeObjectDataList getExternalIdType() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = ExternalIdTypeObjectHelper.fromMapList(inputMap, "ExternalIdTypeList");
  }
}

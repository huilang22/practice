/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UsageTypeBilledFindByInvoiceNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a UsageTypeBilledFindByInvoiceNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class UsageTypeBilledFindByInvoiceNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected UsageTypeObjectDataList noOpIn;

/**
 *
 * Constructor to create a   UsageTypeBilledFindByInvoiceNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public UsageTypeBilledFindByInvoiceNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, UsageTypeObjectDataList noOpInIn) {
    super(id, context, "UsageTypeBilledFindByInvoice");
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
        mapArray[i] = UsageTypeObjectHelper.toMap(noOpIn.getArray()[i], null);
        addInput("UsageType", noOpIn);
      }
      addInput("UsageType", mapList);
    }
  }
/**
 *
 * Sets the  UsageType
 * @param noOpInIn UsageTypeObjectDataList to set
 *
 */
  public void setUsageType(UsageTypeObjectDataList noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the UsageType passed into the constructor
 * @return Simulated response
 *
 */
  public UsageTypeObjectDataList getUsageType() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = UsageTypeObjectHelper.fromMapList(inputMap, "UsageTypeList");
  }
}

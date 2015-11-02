/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchNotifyTypeDeleteNoOpBulkUdtTemplateItem.java
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
import com.csgsystems.bat.data.*;

/**
 *
 * NoOp class used to simulate a BatchNotifyTypeDeleteNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BatchNotifyTypeDeleteNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BatchNotifyTypeObjectData noOpIn;

/**
 *
 * Constructor to create a   BatchNotifyTypeDeleteNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BatchNotifyTypeDeleteNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchNotifyTypeObjectData noOpInIn) {
    super(id, context, "BatchNotifyTypeDelete");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("BatchNotifyType", BatchNotifyTypeObjectHelper.toMap(noOpIn, new HashMap(), "BatchNotifyType").get("BatchNotifyType"));
    }
  }
/**
 *
 * Sets the  BatchNotifyType
 * @param noOpInIn BatchNotifyTypeObjectData to set
 *
 */
  public void setBatchNotifyType(BatchNotifyTypeObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BatchNotifyType passed into the constructor
 * @return Simulated response
 *
 */
  public BatchNotifyTypeObjectData getBatchNotifyType() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BatchNotifyTypeObjectHelper.fromMap(inputMap, "BatchNotifyType");
  }
}

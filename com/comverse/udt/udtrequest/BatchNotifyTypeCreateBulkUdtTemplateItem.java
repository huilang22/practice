/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchNotifyTypeCreateBulkUdtTemplateItem.java
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
 * Class used to create a BatchNotifyTypeCreateBulkUdtTemplateItem Bulk Template
 *
 */

public class BatchNotifyTypeCreateBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BatchNotifyTypeObjectData BatchNotifyTypeCreateIn;
/**
 *
 * Constructor to create a  BatchNotifyTypeCreateBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BatchNotifyTypeCreateBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchNotifyTypeObjectData BatchNotifyTypeCreateInIn) {
    super(id, context, "BatchNotifyTypeCreate");
    BatchNotifyTypeCreateIn = BatchNotifyTypeCreateInIn;
  }

  public void translateToMap() {
    if (BatchNotifyTypeCreateIn != null) {
      BatchNotifyTypeCreateIn.resetFlags(true, true);
      addInput("BatchNotifyType", BatchNotifyTypeObjectHelper.toMap(BatchNotifyTypeCreateIn, new HashMap(), "BatchNotifyType").get("BatchNotifyType"));
    }
  }


/**
 *
 * Sets the BatchNotifyType
 * @param BatchNotifyTypeCreateInIn Value of the BatchNotifyTypeCreateIn
 *
 */

  public void setBatchNotifyType(BatchNotifyTypeObjectData BatchNotifyTypeCreateInIn) {
    BatchNotifyTypeCreateIn = BatchNotifyTypeCreateInIn;
  }

  public void translateFromMap() {
    BatchNotifyTypeCreateIn = BatchNotifyTypeObjectHelper.fromMap(inputMap, "BatchNotifyType");
  }

/**
 *
 * Gets the BatchNotifyType
 * @return Value of the BatchNotifyType
 *
 */

  public BatchNotifyTypeObjectData getBatchNotifyType( ) {
    return BatchNotifyTypeCreateIn;
  }

}

/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchNotifyTypeFindBulkUdtTemplateItem.java
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
 * Class used to create a BatchNotifyTypeFindBulkUdtTemplateItem Bulk Template
 *
 */

public class BatchNotifyTypeFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BatchNotifyTypeObjectFilter batchNotifyTypeFindIn;
/**
 *
 * Constructor to create a  BatchNotifyTypeFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BatchNotifyTypeFindBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchNotifyTypeObjectFilter batchNotifyTypeFindInIn) {
    super(id, context, "BatchNotifyTypeFind");
    batchNotifyTypeFindIn = batchNotifyTypeFindInIn;
  }

  public void translateToMap() {
    if (batchNotifyTypeFindIn != null) {
      Integer index =  batchNotifyTypeFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BatchNotifyType", BatchNotifyTypeObjectHelper.toMap(batchNotifyTypeFindIn, new HashMap(), "BatchNotifyType").get("BatchNotifyType"));
    }
  }


/**
 *
 * Sets the BatchNotifyType
 * @param batchNotifyTypeFindInIn Value of the batchNotifyTypeFindIn
 *
 */

  public void setBatchNotifyType(BatchNotifyTypeObjectFilter batchNotifyTypeFindInIn) {
    batchNotifyTypeFindIn = batchNotifyTypeFindInIn;
  }

  public void translateFromMap() {
    batchNotifyTypeFindIn = BatchNotifyTypeObjectHelper.fromMapFilter(inputMap, "BatchNotifyType");
  }

/**
 *
 * Gets the BatchNotifyType
 * @return Value of the BatchNotifyType
 *
 */

  public BatchNotifyTypeObjectFilter getBatchNotifyType( ) {
    return batchNotifyTypeFindIn;
  }

}

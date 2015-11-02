/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchParticipantTypeFindBulkUdtTemplateItem.java
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
 * Class used to create a BatchParticipantTypeFindBulkUdtTemplateItem Bulk Template
 *
 */

public class BatchParticipantTypeFindBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BatchParticipantTypeObjectFilter batchParticipantTypeFindIn;
/**
 *
 * Constructor to create a  BatchParticipantTypeFindBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BatchParticipantTypeFindBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchParticipantTypeObjectFilter batchParticipantTypeFindInIn) {
    super(id, context, "BatchParticipantTypeFind");
    batchParticipantTypeFindIn = batchParticipantTypeFindInIn;
  }

  public void translateToMap() {
    if (batchParticipantTypeFindIn != null) {
      Integer index =  batchParticipantTypeFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BatchParticipantType", BatchParticipantTypeObjectHelper.toMap(batchParticipantTypeFindIn, new HashMap(), "BatchParticipantType").get("BatchParticipantType"));
    }
  }


/**
 *
 * Sets the BatchParticipantType
 * @param batchParticipantTypeFindInIn Value of the batchParticipantTypeFindIn
 *
 */

  public void setBatchParticipantType(BatchParticipantTypeObjectFilter batchParticipantTypeFindInIn) {
    batchParticipantTypeFindIn = batchParticipantTypeFindInIn;
  }

  public void translateFromMap() {
    batchParticipantTypeFindIn = BatchParticipantTypeObjectHelper.fromMapFilter(inputMap, "BatchParticipantType");
  }

/**
 *
 * Gets the BatchParticipantType
 * @return Value of the BatchParticipantType
 *
 */

  public BatchParticipantTypeObjectFilter getBatchParticipantType( ) {
    return batchParticipantTypeFindIn;
  }

}

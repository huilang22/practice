/*
 * Generated code DO NOT EDIT
 * Generated file: BatchParticipantTypeGetBulkUdtTemplateItem.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

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
 * Class used to create a BatchParticipantTypeGetBulkUdtTemplateItem Bulk Template
 *
 */

public class BatchParticipantTypeGetBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BatchParticipantTypeObjectKeyData batchParticipantTypeGetIn;
/**
 *
 * Constructor to create a  BatchParticipantTypeGetBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BatchParticipantTypeGetBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchParticipantTypeObjectKeyData batchParticipantTypeGetInIn) {
    super(id, context, "BatchParticipantTypeGet");
    batchParticipantTypeGetIn = batchParticipantTypeGetInIn;
  }

  public void translateToMap() {
    if (batchParticipantTypeGetIn != null) {
      batchParticipantTypeGetIn.resetFlags(true, true);
      addInput("BatchParticipantType", BatchParticipantTypeObjectKeyHelper.toMap(batchParticipantTypeGetIn, new HashMap(), "BatchParticipantTypeObjectKeyData").get("BatchParticipantTypeObjectKeyData"));
    }
  }


/**
 *
 * Sets the BatchParticipantType
 * @param batchParticipantTypeGetInIn Value of the batchParticipantTypeGetIn
 *
 */

  public void setBatchParticipantType(BatchParticipantTypeObjectKeyData batchParticipantTypeGetInIn) {
    batchParticipantTypeGetIn = batchParticipantTypeGetInIn;
  }

  public void translateFromMap() {
    batchParticipantTypeGetIn = BatchParticipantTypeObjectKeyHelper.fromMap(inputMap, "BatchParticipantType");
  }

/**
 *
 * Gets the BatchParticipantType
 * @return Value of the BatchParticipantType
 *
 */

  public BatchParticipantTypeObjectKeyData getBatchParticipantType( ) {
    return batchParticipantTypeGetIn;
  }

}

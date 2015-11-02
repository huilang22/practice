/*
 * Generated code DO NOT EDIT
 * Generated file: BatchParticipantTypeGetNoOpBulkUdtTemplateItem.java
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
 * NoOp class used to simulate a BatchParticipantTypeGetNoOpBulkUdtTemplateItem Bulk Request/Response
 *
 */
public class BatchParticipantTypeGetNoOpBulkUdtTemplateItem extends BulkUdtTemplateItem {

  protected BatchParticipantTypeObjectData noOpIn;

/**
 *
 * Constructor to create a   BatchParticipantTypeGetNoOpBulkUdtTemplateItem
 * @param id Unique request name
 * @param noOpInIn Simulated response object
 *
 */
  public BatchParticipantTypeGetNoOpBulkUdtTemplateItem(String id, BSDMSessionContext context, BatchParticipantTypeObjectData noOpInIn) {
    super(id, context, "BatchParticipantTypeGet");
    isNoOp = true;
    noOpIn = noOpInIn;
  }

  public void translateToMap () {
    if (noOpIn != null) {
      noOpIn.resetFlags(true, true);
      addInput("BatchParticipantType", BatchParticipantTypeObjectHelper.toMap(noOpIn, new HashMap(), "BatchParticipantType").get("BatchParticipantType"));
    }
  }
/**
 *
 * Sets the  BatchParticipantType
 * @param noOpInIn BatchParticipantTypeObjectData to set
 *
 */
  public void setBatchParticipantType(BatchParticipantTypeObjectData noOpInIn) {
    noOpIn = noOpInIn;
  };
/**
 *
 * Retrives the BatchParticipantType passed into the constructor
 * @return Simulated response
 *
 */
  public BatchParticipantTypeObjectData getBatchParticipantType() {
    return noOpIn;
  }

public void translateFromMap() {
    noOpIn = BatchParticipantTypeObjectHelper.fromMap(inputMap, "BatchParticipantType");
  }
}

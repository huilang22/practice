/*
 * Generated code DO NOT EDIT
 * Generated file: BatchRequestParticipantSkipErrorParticipantsBulkUdtTemplateItem.java
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
 * Class used to create a BatchRequestParticipantSkipErrorParticipantsBulkUdtTemplateItem Bulk Template
 *
 */

public class BatchRequestParticipantSkipErrorParticipantsBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BigInteger brpsepBatchIdIn;
  protected Integer brpsepRunNumberIn;
/**
 *
 * Constructor to create a  BatchRequestParticipantSkipErrorParticipantsBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BatchRequestParticipantSkipErrorParticipantsBulkUdtTemplateItem(String id, BSDMSessionContext context, BigInteger brpsepBatchIdInIn, Integer brpsepRunNumberInIn) {
    super(id, context, "BatchRequestParticipantSkipErrorParticipants");
    brpsepBatchIdIn = brpsepBatchIdInIn;
    brpsepRunNumberIn = brpsepRunNumberInIn;
  }

  public void translateToMap() {
    if (brpsepBatchIdIn != null) {
      addInput("BrpsepBatchIdIn", brpsepBatchIdIn);
    }
    if (brpsepRunNumberIn != null) {
      addInput("BrpsepRunNumberIn", brpsepRunNumberIn);
    }
  }


/**
 *
 * Sets the BrpsepBatchIdIn
 * @param brpsepBatchIdInIn Value of the brpsepBatchIdIn
 *
 */

  public void setBrpsepBatchIdIn(BigInteger brpsepBatchIdInIn) {
    brpsepBatchIdIn = brpsepBatchIdInIn;
  }

/**
 *
 * Sets the BrpsepRunNumberIn
 * @param brpsepRunNumberInIn Value of the brpsepRunNumberIn
 *
 */

  public void setBrpsepRunNumberIn(Integer brpsepRunNumberInIn) {
    brpsepRunNumberIn = brpsepRunNumberInIn;
  }

  public void translateFromMap() {
    brpsepBatchIdIn = (BigInteger)inputMap.get("BrpsepBatchIdIn");
    brpsepRunNumberIn = (Integer)inputMap.get("BrpsepRunNumberIn");
  }

/**
 *
 * Gets the BrpsepBatchIdIn
 * @return Value of the BrpsepBatchIdIn
 *
 */

  public BigInteger getBrpsepBatchIdIn( ) {
    return brpsepBatchIdIn;
  }

/**
 *
 * Gets the BrpsepRunNumberIn
 * @return Value of the BrpsepRunNumberIn
 *
 */

  public Integer getBrpsepRunNumberIn( ) {
    return brpsepRunNumberIn;
  }

}

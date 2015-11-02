/*
 * Generated code DO NOT EDIT
 * Generated file: BatchRequestParticipantReprocessErrorParticipantsBulkUdtTemplateItem.java
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
 * Class used to create a BatchRequestParticipantReprocessErrorParticipantsBulkUdtTemplateItem Bulk Template
 *
 */

public class BatchRequestParticipantReprocessErrorParticipantsBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BigInteger brprepBatchIdIn;
  protected Integer brprepRunNumberIn;
/**
 *
 * Constructor to create a  BatchRequestParticipantReprocessErrorParticipantsBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public BatchRequestParticipantReprocessErrorParticipantsBulkUdtTemplateItem(String id, BSDMSessionContext context, BigInteger brprepBatchIdInIn, Integer brprepRunNumberInIn) {
    super(id, context, "BatchRequestParticipantReprocessErrorParticipants");
    brprepBatchIdIn = brprepBatchIdInIn;
    brprepRunNumberIn = brprepRunNumberInIn;
  }

  public void translateToMap() {
    if (brprepBatchIdIn != null) {
      addInput("BrprepBatchIdIn", brprepBatchIdIn);
    }
    if (brprepRunNumberIn != null) {
      addInput("BrprepRunNumberIn", brprepRunNumberIn);
    }
  }


/**
 *
 * Sets the BrprepBatchIdIn
 * @param brprepBatchIdInIn Value of the brprepBatchIdIn
 *
 */

  public void setBrprepBatchIdIn(BigInteger brprepBatchIdInIn) {
    brprepBatchIdIn = brprepBatchIdInIn;
  }

/**
 *
 * Sets the BrprepRunNumberIn
 * @param brprepRunNumberInIn Value of the brprepRunNumberIn
 *
 */

  public void setBrprepRunNumberIn(Integer brprepRunNumberInIn) {
    brprepRunNumberIn = brprepRunNumberInIn;
  }

  public void translateFromMap() {
    brprepBatchIdIn = (BigInteger)inputMap.get("BrprepBatchIdIn");
    brprepRunNumberIn = (Integer)inputMap.get("BrprepRunNumberIn");
  }

/**
 *
 * Gets the BrprepBatchIdIn
 * @return Value of the BrprepBatchIdIn
 *
 */

  public BigInteger getBrprepBatchIdIn( ) {
    return brprepBatchIdIn;
  }

/**
 *
 * Gets the BrprepRunNumberIn
 * @return Value of the BrprepRunNumberIn
 *
 */

  public Integer getBrprepRunNumberIn( ) {
    return brprepRunNumberIn;
  }

}

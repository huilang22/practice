/*
 * Generated code DO NOT EDIT
 * Generated file: VoucherDefinitionsUpdateByBatchIdBulkUdtTemplateItem.java
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
import com.csgsystems.bp.data.*;

/**
 *
 * Class used to create a VoucherDefinitionsUpdateByBatchIdBulkUdtTemplateItem Bulk Template
 *
 */

public class VoucherDefinitionsUpdateByBatchIdBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected BigInteger VDUBBatchId_In;
  protected BigInteger VDUBLocCode_In;
  protected BigInteger VDUBStatus_In;
/**
 *
 * Constructor to create a  VoucherDefinitionsUpdateByBatchIdBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public VoucherDefinitionsUpdateByBatchIdBulkUdtTemplateItem(String id, BSDMSessionContext context, BigInteger VDUBBatchId_InIn, BigInteger VDUBLocCode_InIn, BigInteger VDUBStatus_InIn) {
    super(id, context, "VoucherDefinitionsUpdateByBatchId");
    VDUBBatchId_In = VDUBBatchId_InIn;
    VDUBLocCode_In = VDUBLocCode_InIn;
    VDUBStatus_In = VDUBStatus_InIn;
  }

  public void translateToMap() {
    if (VDUBBatchId_In != null) {
      addInput("VDUBBatchIdIn", VDUBBatchId_In);
    }
    if (VDUBLocCode_In != null) {
      addInput("VDUBLocCodeIn", VDUBLocCode_In);
    }
    if (VDUBStatus_In != null) {
      addInput("VDUBStatusIn", VDUBStatus_In);
    }
  }


/**
 *
 * Sets the VDUBBatchIdIn
 * @param VDUBBatchId_InIn Value of the VDUBBatchId_In
 *
 */

  public void setVDUBBatchIdIn(BigInteger VDUBBatchId_InIn) {
    VDUBBatchId_In = VDUBBatchId_InIn;
  }

/**
 *
 * Sets the VDUBLocCodeIn
 * @param VDUBLocCode_InIn Value of the VDUBLocCode_In
 *
 */

  public void setVDUBLocCodeIn(BigInteger VDUBLocCode_InIn) {
    VDUBLocCode_In = VDUBLocCode_InIn;
  }

/**
 *
 * Sets the VDUBStatusIn
 * @param VDUBStatus_InIn Value of the VDUBStatus_In
 *
 */

  public void setVDUBStatusIn(BigInteger VDUBStatus_InIn) {
    VDUBStatus_In = VDUBStatus_InIn;
  }

  public void translateFromMap() {
    VDUBBatchId_In = (BigInteger)inputMap.get("VDUBBatchIdIn");
    VDUBLocCode_In = (BigInteger)inputMap.get("VDUBLocCodeIn");
    VDUBStatus_In = (BigInteger)inputMap.get("VDUBStatusIn");
  }

/**
 *
 * Gets the VDUBBatchIdIn
 * @return Value of the VDUBBatchIdIn
 *
 */

  public BigInteger getVDUBBatchIdIn( ) {
    return VDUBBatchId_In;
  }

/**
 *
 * Gets the VDUBLocCodeIn
 * @return Value of the VDUBLocCodeIn
 *
 */

  public BigInteger getVDUBLocCodeIn( ) {
    return VDUBLocCode_In;
  }

/**
 *
 * Gets the VDUBStatusIn
 * @return Value of the VDUBStatusIn
 *
 */

  public BigInteger getVDUBStatusIn( ) {
    return VDUBStatus_In;
  }

}

/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RefundApproveBulkUdtTemplateItem.java
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
import com.csgsystems.bp.data.*;

/**
 *
 * Class used to create a RefundApproveBulkUdtTemplateItem Bulk Template
 *
 */

public class RefundApproveBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected RefundObjectKeyData refundApproveIn;
  protected Integer AccountInternalId;
  protected String User;
  protected String Supervisor;
  protected BigInteger Amount;
/**
 *
 * Constructor to create a  RefundApproveBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public RefundApproveBulkUdtTemplateItem(String id, BSDMSessionContext context, RefundObjectKeyData refundApproveInIn, Integer AccountInternalIdIn, String UserIn, String SupervisorIn, BigInteger AmountIn) {
    super(id, context, "RefundApprove");
    refundApproveIn = refundApproveInIn;
    AccountInternalId = AccountInternalIdIn;
    User = UserIn;
    Supervisor = SupervisorIn;
    Amount = AmountIn;
  }

  public void translateToMap() {
    if (refundApproveIn != null) {
      refundApproveIn.resetFlags(true, true);
      addInput("Refund", RefundObjectKeyHelper.toMap(refundApproveIn, new HashMap(), "RefundObjectKeyData").get("RefundObjectKeyData"));
    }
    if (AccountInternalId != null) {
      addInput("AccountInternalId", AccountInternalId);
    }
    if (User != null) {
      addInput("User", User);
    }
    if (Supervisor != null) {
      addInput("Supervisor", Supervisor);
    }
    if (Amount != null) {
      addInput("Amount", Amount);
    }
  }


/**
 *
 * Sets the Refund
 * @param refundApproveInIn Value of the refundApproveIn
 *
 */

  public void setRefund(RefundObjectKeyData refundApproveInIn) {
    refundApproveIn = refundApproveInIn;
  }

/**
 *
 * Sets the AccountInternalId
 * @param AccountInternalIdIn Value of the AccountInternalId
 *
 */

  public void setAccountInternalId(Integer AccountInternalIdIn) {
    AccountInternalId = AccountInternalIdIn;
  }

/**
 *
 * Sets the User
 * @param UserIn Value of the User
 *
 */

  public void setUser(String UserIn) {
    User = UserIn;
  }

/**
 *
 * Sets the Supervisor
 * @param SupervisorIn Value of the Supervisor
 *
 */

  public void setSupervisor(String SupervisorIn) {
    Supervisor = SupervisorIn;
  }

/**
 *
 * Sets the Amount
 * @param AmountIn Value of the Amount
 *
 */

  public void setAmount(BigInteger AmountIn) {
    Amount = AmountIn;
  }

  public void translateFromMap() {
    refundApproveIn = RefundObjectKeyHelper.fromMap(inputMap, "Refund");
    AccountInternalId = (Integer)inputMap.get("AccountInternalId");
    User = (String)inputMap.get("User");
    Supervisor = (String)inputMap.get("Supervisor");
    Amount = (BigInteger)inputMap.get("Amount");
  }

/**
 *
 * Gets the Refund
 * @return Value of the Refund
 *
 */

  public RefundObjectKeyData getRefund( ) {
    return refundApproveIn;
  }

/**
 *
 * Gets the AccountInternalId
 * @return Value of the AccountInternalId
 *
 */

  public Integer getAccountInternalId( ) {
    return AccountInternalId;
  }

/**
 *
 * Gets the User
 * @return Value of the User
 *
 */

  public String getUser( ) {
    return User;
  }

/**
 *
 * Gets the Supervisor
 * @return Value of the Supervisor
 *
 */

  public String getSupervisor( ) {
    return Supervisor;
  }

/**
 *
 * Gets the Amount
 * @return Value of the Amount
 *
 */

  public BigInteger getAmount( ) {
    return Amount;
  }

}

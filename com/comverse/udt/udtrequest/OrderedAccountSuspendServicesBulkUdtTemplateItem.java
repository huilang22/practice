/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OrderedAccountSuspendServicesBulkUdtTemplateItem.java
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
import com.csgsystems.om.data.*;

/**
 *
 * Class used to create a OrderedAccountSuspendServicesBulkUdtTemplateItem Bulk Template
 *
 */

public class OrderedAccountSuspendServicesBulkUdtTemplateItem extends BulkUdtTemplateItem {
  protected AccountObjectData oasAccountIn;
  protected OrderObjectData oasOrderIn;
  protected Date EffectiveDt;
  protected Date ResumeDt;
  protected String oasAnnotation;
  protected Boolean oasVerboseResponse;
  protected Boolean oasAutoCommitOrder;
  protected Boolean oasGenerateWorkflow;
  protected String oasJobId;
/**
 *
 * Constructor to create a  OrderedAccountSuspendServicesBulkUdtTemplateItem
 * @param id Unique request name
 *
 */
  public OrderedAccountSuspendServicesBulkUdtTemplateItem(String id, BSDMSessionContext context, AccountObjectData oasAccountInIn, OrderObjectData oasOrderInIn, Date EffectiveDtIn, Date ResumeDtIn, String oasAnnotationIn, Boolean oasVerboseResponseIn, Boolean oasAutoCommitOrderIn, Boolean oasGenerateWorkflowIn, String oasJobIdIn) {
    super(id, context, "OrderedAccountSuspendServices");
    oasAccountIn = oasAccountInIn;
    oasOrderIn = oasOrderInIn;
    EffectiveDt = EffectiveDtIn;
    ResumeDt = ResumeDtIn;
    oasAnnotation = oasAnnotationIn;
    oasVerboseResponse = oasVerboseResponseIn;
    oasAutoCommitOrder = oasAutoCommitOrderIn;
    oasGenerateWorkflow = oasGenerateWorkflowIn;
    oasJobId = oasJobIdIn;
  }

  public void translateToMap() {
    if (oasAccountIn != null) {
      oasAccountIn.resetFlags(true, true);
      addInput("Account", AccountObjectHelper.toMap(oasAccountIn, new HashMap(), "OrderedAccountSuspendServicesOutputData").get("OrderedAccountSuspendServicesOutputData"));
    }
    if (oasOrderIn != null) {
      oasOrderIn.resetFlags(true, true);
      addInput("Order", OrderObjectHelper.toMap(oasOrderIn, new HashMap(), "OrderedAccountSuspendServicesOutputData").get("OrderedAccountSuspendServicesOutputData"));
    }
    if (EffectiveDt != null) {
      addInput("EffectiveDt", EffectiveDt);
    }
    if (ResumeDt != null) {
      addInput("ResumeDt", ResumeDt);
    }
    if (oasAnnotation != null) {
      addInput("Annotation", oasAnnotation);
    }
    if (oasVerboseResponse != null) {
      addInput("VerboseResponse", oasVerboseResponse);
    }
    if (oasAutoCommitOrder != null) {
      addInput("AutoCommitOrder", oasAutoCommitOrder);
    }
    if (oasGenerateWorkflow != null) {
      addInput("GenerateWorkflow", oasGenerateWorkflow);
    }
    if (oasJobId != null) {
      addInput("JobId", oasJobId);
    }
  }


/**
 *
 * Sets the Account
 * @param oasAccountInIn Value of the oasAccountIn
 *
 */

  public void setAccount(AccountObjectData oasAccountInIn) {
    oasAccountIn = oasAccountInIn;
  }

/**
 *
 * Sets the Order
 * @param oasOrderInIn Value of the oasOrderIn
 *
 */

  public void setOrder(OrderObjectData oasOrderInIn) {
    oasOrderIn = oasOrderInIn;
  }

/**
 *
 * Sets the EffectiveDt
 * @param EffectiveDtIn Value of the EffectiveDt
 *
 */

  public void setEffectiveDt(Date EffectiveDtIn) {
    EffectiveDt = EffectiveDtIn;
  }

/**
 *
 * Sets the ResumeDt
 * @param ResumeDtIn Value of the ResumeDt
 *
 */

  public void setResumeDt(Date ResumeDtIn) {
    ResumeDt = ResumeDtIn;
  }

/**
 *
 * Sets the Annotation
 * @param oasAnnotationIn Value of the oasAnnotation
 *
 */

  public void setAnnotation(String oasAnnotationIn) {
    oasAnnotation = oasAnnotationIn;
  }

/**
 *
 * Sets the VerboseResponse
 * @param oasVerboseResponseIn Value of the oasVerboseResponse
 *
 */

  public void setVerboseResponse(Boolean oasVerboseResponseIn) {
    oasVerboseResponse = oasVerboseResponseIn;
  }

/**
 *
 * Sets the AutoCommitOrder
 * @param oasAutoCommitOrderIn Value of the oasAutoCommitOrder
 *
 */

  public void setAutoCommitOrder(Boolean oasAutoCommitOrderIn) {
    oasAutoCommitOrder = oasAutoCommitOrderIn;
  }

/**
 *
 * Sets the GenerateWorkflow
 * @param oasGenerateWorkflowIn Value of the oasGenerateWorkflow
 *
 */

  public void setGenerateWorkflow(Boolean oasGenerateWorkflowIn) {
    oasGenerateWorkflow = oasGenerateWorkflowIn;
  }

/**
 *
 * Sets the JobId
 * @param oasJobIdIn Value of the oasJobId
 *
 */

  public void setJobId(String oasJobIdIn) {
    oasJobId = oasJobIdIn;
  }

  public void translateFromMap() {
    oasAccountIn = AccountObjectHelper.fromMap(inputMap, "Account");
    oasOrderIn = OrderObjectHelper.fromMap(inputMap, "Order");
    EffectiveDt = (Date)inputMap.get("EffectiveDt");
    ResumeDt = (Date)inputMap.get("ResumeDt");
    oasAnnotation = (String)inputMap.get("Annotation");
    oasVerboseResponse = (Boolean)inputMap.get("VerboseResponse");
    oasAutoCommitOrder = (Boolean)inputMap.get("AutoCommitOrder");
    oasGenerateWorkflow = (Boolean)inputMap.get("GenerateWorkflow");
    oasJobId = (String)inputMap.get("JobId");
  }

/**
 *
 * Gets the Account
 * @return Value of the Account
 *
 */

  public AccountObjectData getAccount( ) {
    return oasAccountIn;
  }

/**
 *
 * Gets the Order
 * @return Value of the Order
 *
 */

  public OrderObjectData getOrder( ) {
    return oasOrderIn;
  }

/**
 *
 * Gets the EffectiveDt
 * @return Value of the EffectiveDt
 *
 */

  public Date getEffectiveDt( ) {
    return EffectiveDt;
  }

/**
 *
 * Gets the ResumeDt
 * @return Value of the ResumeDt
 *
 */

  public Date getResumeDt( ) {
    return ResumeDt;
  }

/**
 *
 * Gets the Annotation
 * @return Value of the Annotation
 *
 */

  public String getAnnotation( ) {
    return oasAnnotation;
  }

/**
 *
 * Gets the VerboseResponse
 * @return Value of the VerboseResponse
 *
 */

  public Boolean getVerboseResponse( ) {
    return oasVerboseResponse;
  }

/**
 *
 * Gets the AutoCommitOrder
 * @return Value of the AutoCommitOrder
 *
 */

  public Boolean getAutoCommitOrder( ) {
    return oasAutoCommitOrder;
  }

/**
 *
 * Gets the GenerateWorkflow
 * @return Value of the GenerateWorkflow
 *
 */

  public Boolean getGenerateWorkflow( ) {
    return oasGenerateWorkflow;
  }

/**
 *
 * Gets the JobId
 * @return Value of the JobId
 *
 */

  public String getJobId( ) {
    return oasJobId;
  }

}

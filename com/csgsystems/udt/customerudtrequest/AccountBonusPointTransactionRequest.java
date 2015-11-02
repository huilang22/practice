/*
 * Generated code DO NOT EDIT
 * Generated file: AccountBonusPointTransactionRequest.java
 * Copyright 2006 Comverse, Inc. All Rights Reserved.
*/

package com.csgsystems.udt.customerudtrequest;

import com.csgsystems.api.bulk.*;
import com.csgsystems.udt.*;
import java.util.Map;
import java.util.Date;
import java.util.Set;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.math.BigInteger;

import com.csgsystems.bp.data.*;
public final class AccountBonusPointTransactionRequest extends UdtRequest {
  /**
    Constructor
    @param request - Unique name for request
    @param method - Method name for request
  */
  public AccountBonusPointTransactionRequest (String request, AccountBonusPointTransactionRequestMethod method) {
    initialize(request, "AccountBonusPointTransaction", method.getMethod());
  }
  /**
    Adds a SelfRequest for this request
    @param self Request for SelfRequest
  */
  public void addSelfRequest (AccountBonusPointTransactionRequest self) {
    requests.add(new SubRequestWrapper(self, new SubRequestData("SelfRequest", null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(AccountRequest request, AccountBonusPointTransactionRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(AccountRequest request, AccountBonusPointTransactionRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
    @param dynamics Collection of DynamicRelationships for SubRequest
  */
  public void addSubRequest(InvoiceRequest request, AccountBonusPointTransactionRequestRelationship relationship, Collection dynamics) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), dynamics)));
  }
  /**
    Adds a SubRequest for this request
    @param request Request for SubRequest
    @param relationship Relationship for SubRequest
  */
  public void addSubRequest(InvoiceRequest request, AccountBonusPointTransactionRequestRelationship relationship) {
    requests.add(new SubRequestWrapper(request, new SubRequestData(relationship.getRelationship(), null)));
  }
  public void setAccountBonusPointTransactionForAccountBonusPointTransactionActivate(AccountBonusPointTransactionObjectKeyData data) {
    if (data != null) {
      addInput("AccountBonusPointTransaction", AccountBonusPointTransactionObjectKeyHelper.toMap(data, new HashMap(), "AccountBonusPointTransaction").get("AccountBonusPointTransaction"));
    }
  }
  public void setAccountBonusPointTransactionForAccountBonusPointTransactionAddBalance(AccountBonusPointTransactionObjectData data) {
    if (data != null) {
      addInput("AccountBonusPointTransaction", AccountBonusPointTransactionObjectHelper.toMap(data, new HashMap(), "AccountBonusPointTransaction").get("AccountBonusPointTransaction"));
    }
  }
  public void setAccountExternalIdForAccountBonusPointTransactionAddBalance(String data) {
    if (data != null) {
      addInput("AccountExternalId", data);
    }
  }
  public void setAccountExternalIdTypeForAccountBonusPointTransactionAddBalance(BigInteger data) {
    if (data != null) {
      addInput("AccountExternalIdType", data);
    }
  }
  public void setAccountInternalIdForAccountBonusPointTransactionBalance(Integer data) {
    if (data != null) {
      addInput("AccountInternalId", data);
    }
  }
  public void setCurrentDateForAccountBonusPointTransactionBalance(Date data) {
    if (data != null) {
      addInput("CurrentDate", data);
    }
  }
  public void setAccountBonusPointTransactionForAccountBonusPointTransactionCreate(AccountBonusPointTransactionObjectData data) {
    if (data != null) {
      addInput("AccountBonusPointTransaction", AccountBonusPointTransactionObjectHelper.toMap(data, new HashMap(), "AccountBonusPointTransaction").get("AccountBonusPointTransaction"));
    }
  }
  public void setAccountBonusPointTransactionForAccountBonusPointTransactionDelete(AccountBonusPointTransactionObjectKeyData data) {
    if (data != null) {
      addInput("AccountBonusPointTransaction", AccountBonusPointTransactionObjectKeyHelper.toMap(data, new HashMap(), "AccountBonusPointTransaction").get("AccountBonusPointTransaction"));
    }
  }
  public void setAccountInternalIdForAccountBonusPointTransactionExpiringBalance(Integer data) {
    if (data != null) {
      addInput("AccountInternalId", data);
    }
  }
  public void setFromDateForAccountBonusPointTransactionExpiringBalance(Date data) {
    if (data != null) {
      addInput("FromDate", data);
    }
  }
  public void setToDateForAccountBonusPointTransactionExpiringBalance(Date data) {
    if (data != null) {
      addInput("ToDate", data);
    }
  }
  public void setAccountBonusPointTransactionForAccountBonusPointTransactionFind(AccountBonusPointTransactionObjectFilter data) {
    if (data != null) {
      addInput("AccountBonusPointTransaction", AccountBonusPointTransactionObjectHelper.toMap(data, new HashMap(), "AccountBonusPointTransaction").get("AccountBonusPointTransaction"));
    }
  }
  public void setAccountBonusPointTransactionForAccountBonusPointTransactionFindbyRewardbalance(AccountBonusPointTransactionObjectFilter data) {
    if (data != null) {
      addInput("AccountBonusPointTransaction", AccountBonusPointTransactionObjectHelper.toMap(data, new HashMap(), "AccountBonusPointTransaction").get("AccountBonusPointTransaction"));
    }
  }
  public void setAccountBonusPointTransactionForAccountBonusPointTransactionGet(AccountBonusPointTransactionObjectKeyData data) {
    if (data != null) {
      addInput("AccountBonusPointTransaction", AccountBonusPointTransactionObjectKeyHelper.toMap(data, new HashMap(), "AccountBonusPointTransaction").get("AccountBonusPointTransaction"));
    }
  }
  public void setAccountBonusPointTransactionForAccountBonusPointTransactionRedeemPoints(AccountBonusPointTransactionObjectData data) {
    if (data != null) {
      addInput("AccountBonusPointTransaction", AccountBonusPointTransactionObjectHelper.toMap(data, new HashMap(), "AccountBonusPointTransaction").get("AccountBonusPointTransaction"));
    }
  }
  public void setAccountBonusPointTransactionFromForAccountBonusPointTransactionTransfer(AccountBonusPointTransactionObjectData data) {
    if (data != null) {
      addInput("AccountBonusPointTransactionFrom", AccountBonusPointTransactionObjectHelper.toMap(data, new HashMap(), "AccountBonusPointTransactionFrom").get("AccountBonusPointTransactionFrom"));
    }
  }
  public void setAccountBonusPointTransactionToForAccountBonusPointTransactionTransfer(AccountBonusPointTransactionObjectData data) {
    if (data != null) {
      addInput("AccountBonusPointTransactionTo", AccountBonusPointTransactionObjectHelper.toMap(data, new HashMap(), "AccountBonusPointTransactionTo").get("AccountBonusPointTransactionTo"));
    }
  }
  public void setAccountBonusPointTransactionForAccountBonusPointTransactionUpdate(AccountBonusPointTransactionObjectData data) {
    if (data != null) {
      addInput("AccountBonusPointTransaction", AccountBonusPointTransactionObjectHelper.toMap(data, new HashMap(), "AccountBonusPointTransaction").get("AccountBonusPointTransaction"));
    }
  }
  public void setAccountBonusPointTransactionForAccountBonusPointTransactionUpdatePoints(AccountBonusPointTransactionObjectData data) {
    if (data != null) {
      addInput("AccountBonusPointTransaction", AccountBonusPointTransactionObjectHelper.toMap(data, new HashMap(), "AccountBonusPointTransaction").get("AccountBonusPointTransaction"));
    }
  }
  public void setABPFromDateInForAccountBonusPointTransactionUpdateUnredeemed(Date data) {
    if (data != null) {
      addInput("ABPFromDateIn", data);
    }
  }
  public void setABPToDateInForAccountBonusPointTransactionUpdateUnredeemed(Date data) {
    if (data != null) {
      addInput("ABPToDateIn", data);
    }
  }
  public void setAccountBonusPointTransactionForAccountBonusPointTransactionUpdateUnredeemed(AccountBonusPointTransactionObjectData data) {
    if (data != null) {
      addInput("AccountBonusPointTransaction", AccountBonusPointTransactionObjectHelper.toMap(data, new HashMap(), "AccountBonusPointTransaction").get("AccountBonusPointTransaction"));
    }
  }
  public AccountBonusPointTransactionObjectData getAccountBonusPointTransactionObjectDataAccountBonusPointTransactionFromAccountBonusPointTransactionActivate() {
    return AccountBonusPointTransactionObjectHelper.fromMap(outputMap, "AccountBonusPointTransaction");
  }
  public AccountBonusPointTransactionObjectData getAccountBonusPointTransactionObjectDataAccountBonusPointTransactionFromAccountBonusPointTransactionAddBalance() {
    return AccountBonusPointTransactionObjectHelper.fromMap(outputMap, "AccountBonusPointTransaction");
  }
  public BigInteger getBigIntegerAmountFromAccountBonusPointTransactionBalance() {
    return (BigInteger)outputMap.get("Amount");
  }
  public AccountBonusPointTransactionObjectData getAccountBonusPointTransactionObjectDataAccountBonusPointTransactionFromAccountBonusPointTransactionCreate() {
    return AccountBonusPointTransactionObjectHelper.fromMap(outputMap, "AccountBonusPointTransaction");
  }
  public AccountBonusPointTransactionObjectData getAccountBonusPointTransactionObjectDataAccountBonusPointTransactionFromAccountBonusPointTransactionDelete() {
    return AccountBonusPointTransactionObjectHelper.fromMap(outputMap, "AccountBonusPointTransaction");
  }
  public BigInteger getBigIntegerAmountFromAccountBonusPointTransactionExpiringBalance() {
    return (BigInteger)outputMap.get("Amount");
  }
  public AccountBonusPointTransactionObjectDataList getAccountBonusPointTransactionObjectDataAccountBonusPointTransactionFromAccountBonusPointTransactionFind() {
    return AccountBonusPointTransactionObjectHelper.fromMapList(outputMap, "AccountBonusPointTransactionList");
  }
  public AccountBonusPointTransactionObjectDataList getAccountBonusPointTransactionObjectDataAccountBonusPointTransactionFromAccountBonusPointTransactionFindbyRewardbalance() {
    return AccountBonusPointTransactionObjectHelper.fromMapList(outputMap, "AccountBonusPointTransactionList");
  }
  public AccountBonusPointTransactionObjectData getAccountBonusPointTransactionObjectDataAccountBonusPointTransactionFromAccountBonusPointTransactionGet() {
    return AccountBonusPointTransactionObjectHelper.fromMap(outputMap, "AccountBonusPointTransaction");
  }
  public AccountBonusPointTransactionObjectData getAccountBonusPointTransactionObjectDataAccountBonusPointTransactionFromAccountBonusPointTransactionRedeemPoints() {
    return AccountBonusPointTransactionObjectHelper.fromMap(outputMap, "AccountBonusPointTransaction");
  }
  public AccountBonusPointTransactionTransferOutputData getAccountBonusPointTransactionTransferOutputDataAccountBonusPointTransactionTransferOutputDataFromAccountBonusPointTransactionTransfer() {
    return AccountBonusPointTransactionTransferOutputHelper.fromMap(outputMap);
  }
  public AccountBonusPointTransactionObjectData getAccountBonusPointTransactionObjectDataAccountBonusPointTransactionFromAccountBonusPointTransactionUpdate() {
    return AccountBonusPointTransactionObjectHelper.fromMap(outputMap, "AccountBonusPointTransaction");
  }
  public AccountBonusPointTransactionObjectData getAccountBonusPointTransactionObjectDataAccountBonusPointTransactionFromAccountBonusPointTransactionUpdatePoints() {
    return AccountBonusPointTransactionObjectHelper.fromMap(outputMap, "AccountBonusPointTransaction");
  }
  public Integer getIntegerABPUpdateUnredeemedCountOutFromAccountBonusPointTransactionUpdateUnredeemed() {
    return (Integer)outputMap.get("ABPUpdateUnredeemedCountOut");
  }
  /**
   @deprecated
   */
  public void setABPFromDateIn(Date data) {
    if (data != null) {
      addInput("ABPFromDateIn", data);
    }
  }
  /**
   @deprecated
   */
  public void setABPToDateIn(Date data) {
    if (data != null) {
      addInput("ABPToDateIn", data);
    }
  }
  /**
   @deprecated
   */
  public Integer getABPUpdateUnredeemedCountOut() {
    return (Integer)outputMap.get("ABPUpdateUnredeemedCountOut");
  }
  /**
   @deprecated
   */
  public void setAccountBonusPointTransactionObjectFilter(AccountBonusPointTransactionObjectFilter data) {
    if (data != null) {
      addInput("AccountBonusPointTransaction", AccountBonusPointTransactionObjectHelper.toMap(data, new HashMap()).get("AccountBonusPointTransactionObject"));
    }
  }
  /**
   @deprecated
   */
  public void setAccountBonusPointTransactionObjectData(AccountBonusPointTransactionObjectData data) {
    if (data != null) {
      addInput("AccountBonusPointTransaction", AccountBonusPointTransactionObjectHelper.toMap(data, new HashMap()).get("AccountBonusPointTransactionObject"));
    }
  }
  /**
   @deprecated
   */
  public void setAccountBonusPointTransactionObjectKeyData(AccountBonusPointTransactionObjectKeyData data) {
    if (data != null) {
      addInput("AccountBonusPointTransaction", AccountBonusPointTransactionObjectKeyHelper.toMap(data, new HashMap()).get("AccountBonusPointTransactionObject"));
    }
  }
  /**
   @deprecated
   */
  public AccountBonusPointTransactionObjectDataList getAccountBonusPointTransactionObjectDataList() {
    return AccountBonusPointTransactionObjectHelper.fromMapList(outputMap, "AccountBonusPointTransactionList");
  }
  /**
   @deprecated
   */
  public AccountBonusPointTransactionObjectData getAccountBonusPointTransactionObjectData() {
    return AccountBonusPointTransactionObjectHelper.fromMap(outputMap, "AccountBonusPointTransaction");
  }
  /**
   @deprecated
   */
  public AccountBonusPointTransactionTransferOutputData getAccountBonusPointTransactionTransferOutputData() {
    return AccountBonusPointTransactionTransferOutputHelper.fromMap(outputMap);
  }
  /**
   @deprecated
   */
  public void setAccountExternalId(String data) {
    if (data != null) {
      addInput("AccountExternalId", data);
    }
  }
  /**
   @deprecated
   */
  public void setAccountExternalIdType(BigInteger data) {
    if (data != null) {
      addInput("AccountExternalIdType", data);
    }
  }
  /**
   @deprecated
   */
  public void setAccountInternalId(Integer data) {
    if (data != null) {
      addInput("AccountInternalId", data);
    }
  }
  /**
   @deprecated
   */
  public BigInteger getAmount() {
    return (BigInteger)outputMap.get("Amount");
  }
  /**
   @deprecated
   */
  public void setCurrentDate(Date data) {
    if (data != null) {
      addInput("CurrentDate", data);
    }
  }
  /**
   @deprecated
   */
  public void setFromDate(Date data) {
    if (data != null) {
      addInput("FromDate", data);
    }
  }
  /**
   @deprecated
   */
  public void setToDate(Date data) {
    if (data != null) {
      addInput("ToDate", data);
    }
  }
}

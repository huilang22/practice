
package com.csgsystems.bp.interfaces;

import java.io.*;
import java.math.*;
import java.util.*;

import javax.ejb.Remote;

import com.csgsystems.bali.BaliInterface;

import com.csgsystems.aruba.connection.BSDMResourceException;
import com.csgsystems.aruba.connection.BSDMSessionContext;

import com.csgsystems.api.constraint.ConstraintException;


import com.csgsystems.bp.data.*;

/**
 * Comverse Product: BP.
 * Note: Some defaulted inputs depend on _REF tables having is_default rows and will not always be set.
 *       Conditional defaults/derivations/null-allowables are not listed here.
 */
@Remote
public interface HqGroupContractsInterface extends BaliInterface {

  /**
   * Retrieve a unique Group Product..
   * Convenience method using default BSDMSessionContext.
   * @param HQGroupContractsgetIn Input  Object.
   * @return HqGroupContractsObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public HqGroupContractsObjectData get (HqGroupContractsObjectData HQGroupContractsgetIn) throws BSDMResourceException;
  /**
   * Retrieve a unique Group Product..
   * @param context The session context to use when connecting to the APITS server.
   * @param HQGroupContractsgetIn Input  Object.
   * @return HqGroupContractsObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public HqGroupContractsObjectData get (BSDMSessionContext context, HqGroupContractsObjectData HQGroupContractsgetIn) throws BSDMResourceException;


  /**
   * Retrieve a unique Group Product..
   * Convenience method using default BSDMSessionContext.
   * @param HQGroupContractsgetIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return HqGroupContractsObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public HqGroupContractsObjectData get (HqGroupContractsObjectData HQGroupContractsgetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Retrieve a unique Group Product..
   * @param context The session context to use when connecting to the APITS server.
   * @param HQGroupContractsgetIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return HqGroupContractsObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public HqGroupContractsObjectData get (BSDMSessionContext context, HqGroupContractsObjectData HQGroupContractsgetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Find Group Product's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param HQGroupContractsfindIn Input Filter Object.
   * @return HqGroupContractsObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public HqGroupContractsObjectDataList find (HqGroupContractsObjectFilter HQGroupContractsfindIn) throws BSDMResourceException;
  /**
   * Find Group Product's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param HQGroupContractsfindIn Input Filter Object.
   * @return HqGroupContractsObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public HqGroupContractsObjectDataList find (BSDMSessionContext context, HqGroupContractsObjectFilter HQGroupContractsfindIn) throws BSDMResourceException;


  /**
   * Find Group Product's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param HQGroupContractsfindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return HqGroupContractsObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public HqGroupContractsObjectDataList find (HqGroupContractsObjectFilter HQGroupContractsfindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find Group Product's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param HQGroupContractsfindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return HqGroupContractsObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public HqGroupContractsObjectDataList find (BSDMSessionContext context, HqGroupContractsObjectFilter HQGroupContractsfindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Create a new Group Product row, tracking_id and tracking_id_serv should be present in CUSTOMER_CONTRACTS..
   * Convenience method using default BSDMSessionContext.
   * @param HQGroupContractscreateIn Input  Object.
   * @return HqGroupContractsObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public HqGroupContractsObjectData create (HqGroupContractsObjectData HQGroupContractscreateIn) throws BSDMResourceException;
  /**
   * Create a new Group Product row, tracking_id and tracking_id_serv should be present in CUSTOMER_CONTRACTS..
   * @param context The session context to use when connecting to the APITS server.
   * @param HQGroupContractscreateIn Input  Object.
   * @return HqGroupContractsObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public HqGroupContractsObjectData create (BSDMSessionContext context, HqGroupContractsObjectData HQGroupContractscreateIn) throws BSDMResourceException;


  /**
   * Create a new Group Product row, tracking_id and tracking_id_serv should be present in CUSTOMER_CONTRACTS..
   * Convenience method using default BSDMSessionContext.
   * @param HQGroupContractscreateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return HqGroupContractsObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public HqGroupContractsObjectData create (HqGroupContractsObjectData HQGroupContractscreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Create a new Group Product row, tracking_id and tracking_id_serv should be present in CUSTOMER_CONTRACTS..
   * @param context The session context to use when connecting to the APITS server.
   * @param HQGroupContractscreateIn Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return HqGroupContractsObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public HqGroupContractsObjectData create (BSDMSessionContext context, HqGroupContractsObjectData HQGroupContractscreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Convenience method using default BSDMSessionContext.
   * @param HQGroupContractsDeleteIn Input  Object.
   * @param ContractViewId.
   * @return HqGroupContractsObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public HqGroupContractsObjectData delete (HqGroupContractsObjectData HQGroupContractsDeleteIn, Integer ContractViewId) throws BSDMResourceException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param HQGroupContractsDeleteIn Input  Object.
   * @param ContractViewId.
   * @return HqGroupContractsObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public HqGroupContractsObjectData delete (BSDMSessionContext context, HqGroupContractsObjectData HQGroupContractsDeleteIn, Integer ContractViewId) throws BSDMResourceException;


  /**
   * Convenience method using default BSDMSessionContext.
   * @param HQGroupContractsDeleteIn Input  Object.
   * @param ContractViewId.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return HqGroupContractsObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public HqGroupContractsObjectData delete (HqGroupContractsObjectData HQGroupContractsDeleteIn, Integer ContractViewId, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * @param context The session context to use when connecting to the APITS server.
   * @param HQGroupContractsDeleteIn Input  Object.
   * @param ContractViewId.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return HqGroupContractsObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public HqGroupContractsObjectData delete (BSDMSessionContext context, HqGroupContractsObjectData HQGroupContractsDeleteIn, Integer ContractViewId, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * 
            Update the values (other than the key) of the HqGroupContractsObject.
        .
   * Convenience method using default BSDMSessionContext.
   * @param HqGroupContractsupdate_In Input  Object.
   * @return HqGroupContractsObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public HqGroupContractsObjectData update (HqGroupContractsObjectData HqGroupContractsupdate_In) throws BSDMResourceException;
  /**
   * 
            Update the values (other than the key) of the HqGroupContractsObject.
        .
   * @param context The session context to use when connecting to the APITS server.
   * @param HqGroupContractsupdate_In Input  Object.
   * @return HqGroupContractsObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public HqGroupContractsObjectData update (BSDMSessionContext context, HqGroupContractsObjectData HqGroupContractsupdate_In) throws BSDMResourceException;


  /**
   * 
            Update the values (other than the key) of the HqGroupContractsObject.
        .
   * Convenience method using default BSDMSessionContext.
   * @param HqGroupContractsupdate_In Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return HqGroupContractsObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public HqGroupContractsObjectData update (HqGroupContractsObjectData HqGroupContractsupdate_In, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * 
            Update the values (other than the key) of the HqGroupContractsObject.
        .
   * @param context The session context to use when connecting to the APITS server.
   * @param HqGroupContractsupdate_In Input  Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return HqGroupContractsObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public HqGroupContractsObjectData update (BSDMSessionContext context, HqGroupContractsObjectData HqGroupContractsupdate_In, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}

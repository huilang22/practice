
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
public interface ProductRateKeyInterface extends BaliInterface {

  /**
   * Retrieve a unique ProductRateKey row..
   * Convenience method using default BSDMSessionContext.
   * @param PRKGetIn Input Object Key.
   * @return ProductRateKeyObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ProductRateKeyObjectData get (ProductRateKeyObjectKeyData PRKGetIn) throws BSDMResourceException;
  /**
   * Retrieve a unique ProductRateKey row..
   * @param context The session context to use when connecting to the APITS server.
   * @param PRKGetIn Input Object Key.
   * @return ProductRateKeyObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ProductRateKeyObjectData get (BSDMSessionContext context, ProductRateKeyObjectKeyData PRKGetIn) throws BSDMResourceException;


  /**
   * Retrieve a unique ProductRateKey row..
   * Convenience method using default BSDMSessionContext.
   * @param PRKGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ProductRateKeyObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public ProductRateKeyObjectData get (ProductRateKeyObjectKeyData PRKGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Retrieve a unique ProductRateKey row..
   * @param context The session context to use when connecting to the APITS server.
   * @param PRKGetIn Input Object Key.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ProductRateKeyObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public ProductRateKeyObjectData get (BSDMSessionContext context, ProductRateKeyObjectKeyData PRKGetIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Find ProductRateKey's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param PRKFindIn Input Filter Object.
   * @return ProductRateKeyObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ProductRateKeyObjectDataList find (ProductRateKeyObjectFilter PRKFindIn) throws BSDMResourceException;
  /**
   * Find ProductRateKey's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param PRKFindIn Input Filter Object.
   * @return ProductRateKeyObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ProductRateKeyObjectDataList find (BSDMSessionContext context, ProductRateKeyObjectFilter PRKFindIn) throws BSDMResourceException;


  /**
   * Find ProductRateKey's that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param PRKFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ProductRateKeyObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public ProductRateKeyObjectDataList find (ProductRateKeyObjectFilter PRKFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Find ProductRateKey's that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param PRKFindIn Input Filter Object.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ProductRateKeyObjectDataList as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public ProductRateKeyObjectDataList find (BSDMSessionContext context, ProductRateKeyObjectFilter PRKFindIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Create a new ProductRateKey..
   * Convenience method using default BSDMSessionContext.
   * @param PRKCreateIn Input  Object.  Read-Only fields: ChgWho, ChgDt, Jurisdiction.  Defaulted Fields: ActiveDt, OriginLocationCode, TargetLocationCode, Units, UnitsType.  Derived Fields: Jurisdiction, ChgWho, ChgDt.
   * @return ProductRateKeyObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ProductRateKeyObjectData create (ProductRateKeyObjectData PRKCreateIn) throws BSDMResourceException;
  /**
   * Create a new ProductRateKey..
   * @param context The session context to use when connecting to the APITS server.
   * @param PRKCreateIn Input  Object.  Read-Only fields: ChgWho, ChgDt, Jurisdiction.  Defaulted Fields: ActiveDt, OriginLocationCode, TargetLocationCode, Units, UnitsType.  Derived Fields: Jurisdiction, ChgWho, ChgDt.
   * @return ProductRateKeyObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ProductRateKeyObjectData create (BSDMSessionContext context, ProductRateKeyObjectData PRKCreateIn) throws BSDMResourceException;


  /**
   * Create a new ProductRateKey..
   * Convenience method using default BSDMSessionContext.
   * @param PRKCreateIn Input  Object.  Read-Only fields: ChgWho, ChgDt, Jurisdiction.  Defaulted Fields: ActiveDt, OriginLocationCode, TargetLocationCode, Units, UnitsType.  Derived Fields: Jurisdiction, ChgWho, ChgDt.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ProductRateKeyObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public ProductRateKeyObjectData create (ProductRateKeyObjectData PRKCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Create a new ProductRateKey..
   * @param context The session context to use when connecting to the APITS server.
   * @param PRKCreateIn Input  Object.  Read-Only fields: ChgWho, ChgDt, Jurisdiction.  Defaulted Fields: ActiveDt, OriginLocationCode, TargetLocationCode, Units, UnitsType.  Derived Fields: Jurisdiction, ChgWho, ChgDt.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ProductRateKeyObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public ProductRateKeyObjectData create (BSDMSessionContext context, ProductRateKeyObjectData PRKCreateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Update the non-key fields of a ProductRateKey..
   * Convenience method using default BSDMSessionContext.
   * @param PRKUpdateIn Input  Object.  Read-Only fields: ChgWho, ChgDt, InactiveDt, Jurisdiction.  Derived Fields: ChgWho, ChgDt.
   * @return ProductRateKeyObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ProductRateKeyObjectData update (ProductRateKeyObjectData PRKUpdateIn) throws BSDMResourceException;
  /**
   * Update the non-key fields of a ProductRateKey..
   * @param context The session context to use when connecting to the APITS server.
   * @param PRKUpdateIn Input  Object.  Read-Only fields: ChgWho, ChgDt, InactiveDt, Jurisdiction.  Derived Fields: ChgWho, ChgDt.
   * @return ProductRateKeyObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public ProductRateKeyObjectData update (BSDMSessionContext context, ProductRateKeyObjectData PRKUpdateIn) throws BSDMResourceException;


  /**
   * Update the non-key fields of a ProductRateKey..
   * Convenience method using default BSDMSessionContext.
   * @param PRKUpdateIn Input  Object.  Read-Only fields: ChgWho, ChgDt, InactiveDt, Jurisdiction.  Derived Fields: ChgWho, ChgDt.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ProductRateKeyObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public ProductRateKeyObjectData update (ProductRateKeyObjectData PRKUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Update the non-key fields of a ProductRateKey..
   * @param context The session context to use when connecting to the APITS server.
   * @param PRKUpdateIn Input  Object.  Read-Only fields: ChgWho, ChgDt, InactiveDt, Jurisdiction.  Derived Fields: ChgWho, ChgDt.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return ProductRateKeyObjectData as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public ProductRateKeyObjectData update (BSDMSessionContext context, ProductRateKeyObjectData PRKUpdateIn, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Cease a ProductRateKey..
   * Convenience method using default BSDMSessionContext.
   * @param PRKDeleteIn Input Object Key.
   * @param PRKCeaseDate (has a default).
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public void delete (ProductRateKeyObjectKeyData PRKDeleteIn, Date PRKCeaseDate) throws BSDMResourceException;
  /**
   * Cease a ProductRateKey..
   * @param context The session context to use when connecting to the APITS server.
   * @param PRKDeleteIn Input Object Key.
   * @param PRKCeaseDate (has a default).
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public void delete (BSDMSessionContext context, ProductRateKeyObjectKeyData PRKDeleteIn, Date PRKCeaseDate) throws BSDMResourceException;


  /**
   * Cease a ProductRateKey..
   * Convenience method using default BSDMSessionContext.
   * @param PRKDeleteIn Input Object Key.
   * @param PRKCeaseDate (has a default).

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public void delete (ProductRateKeyObjectKeyData PRKDeleteIn, Date PRKCeaseDate, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Cease a ProductRateKey..
   * @param context The session context to use when connecting to the APITS server.
   * @param PRKDeleteIn Input Object Key.
   * @param PRKCeaseDate (has a default).

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public void delete (BSDMSessionContext context, ProductRateKeyObjectKeyData PRKDeleteIn, Date PRKCeaseDate, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Cease the ProductRateKeys that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param ProductRateKeyFilter Input Filter Object.
   * @param PRKLCeaseDate (has a default).
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public void deleteList (ProductRateKeyObjectFilter ProductRateKeyFilter, Date PRKLCeaseDate) throws BSDMResourceException;
  /**
   * Cease the ProductRateKeys that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param ProductRateKeyFilter Input Filter Object.
   * @param PRKLCeaseDate (has a default).
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public void deleteList (BSDMSessionContext context, ProductRateKeyObjectFilter ProductRateKeyFilter, Date PRKLCeaseDate) throws BSDMResourceException;


  /**
   * Cease the ProductRateKeys that match the supplied filter..
   * Convenience method using default BSDMSessionContext.
   * @param ProductRateKeyFilter Input Filter Object.
   * @param PRKLCeaseDate (has a default).

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public void deleteList (ProductRateKeyObjectFilter ProductRateKeyFilter, Date PRKLCeaseDate, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Cease the ProductRateKeys that match the supplied filter..
   * @param context The session context to use when connecting to the APITS server.
   * @param ProductRateKeyFilter Input Filter Object.
   * @param PRKLCeaseDate (has a default).

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public void deleteList (BSDMSessionContext context, ProductRateKeyObjectFilter ProductRateKeyFilter, Date PRKLCeaseDate, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

  /**
   * Derives a ProductJurisdiction for a unique ProductRateKey row..
   * Convenience method using default BSDMSessionContext.
   * @param TargetLocCode.
   * @param OriginLocCode.
   * @param ActiveDate.
   * @param ElementId.
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public Integer jurisdictionDerive (Integer TargetLocCode, Integer OriginLocCode, Date ActiveDate, Integer ElementId) throws BSDMResourceException;
  /**
   * Derives a ProductJurisdiction for a unique ProductRateKey row..
   * @param context The session context to use when connecting to the APITS server.
   * @param TargetLocCode.
   * @param OriginLocCode.
   * @param ActiveDate.
   * @param ElementId.
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   */
  public Integer jurisdictionDerive (BSDMSessionContext context, Integer TargetLocCode, Integer OriginLocCode, Date ActiveDate, Integer ElementId) throws BSDMResourceException;


  /**
   * Derives a ProductJurisdiction for a unique ProductRateKey row..
   * Convenience method using default BSDMSessionContext.
   * @param TargetLocCode.
   * @param OriginLocCode.
   * @param ActiveDate.
   * @param ElementId.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException if constraints fail
   */
  public Integer jurisdictionDerive (Integer TargetLocCode, Integer OriginLocCode, Date ActiveDate, Integer ElementId, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;
  /**
   * Derives a ProductJurisdiction for a unique ProductRateKey row..
   * @param context The session context to use when connecting to the APITS server.
   * @param TargetLocCode.
   * @param OriginLocCode.
   * @param ActiveDate.
   * @param ElementId.

   * @param defaultAction Default action for defaulting values
   * @param constraintAction Constraint action for constraint checks
   * @return Integer as output
   * @throws BSDMResourceException Whenever an error is encountered
   * @throws ConstraintException When constraints fail
   */
  public Integer jurisdictionDerive (BSDMSessionContext context, Integer TargetLocCode, Integer OriginLocCode, Date ActiveDate, Integer ElementId, String defaultAction, String constraintAction) throws BSDMResourceException, ConstraintException;

}
